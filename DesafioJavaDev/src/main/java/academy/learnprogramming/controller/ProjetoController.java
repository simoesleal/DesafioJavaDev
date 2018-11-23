package academy.learnprogramming.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import academy.learnprogramming.dao.ProjetoDAO;
import academy.learnprogramming.model.Projeto;
import academy.learnprogramming.service.ProjetoService;
import academy.learnprogramming.util.AttributeNames;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;

@Controller
public class ProjetoController {
	
	// == fields ==
	private final ProjetoService projetoService;
	
	// == constructor ==
	public ProjetoController(ProjetoService projetoService) {
		this.projetoService = projetoService;
	}
	
	// == model attribute ==	
	@ModelAttribute
	public ProjetoDAO projetoDao() {
		return projetoService.getData();
	}
	
	// == model attribute ==	
	@ModelAttribute
	public ProjetoDAO todoData() {
		return projetoService.getData();
	}
	
	
	@GetMapping(Mappings.PROJETOS)
	public String items() {
		return ViewNames.PROJETOS;
	}
	
	@GetMapping(Mappings.ADD_PROJETO)
	public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {
		Projeto projeto = projetoService.getItem(id);
		
		if(projeto == null) {
			projeto = new Projeto();
		}
		model.addAttribute(AttributeNames.PROJETO, projeto);
		return ViewNames.ADD_PROJETO;
	}
	
	@PostMapping(Mappings.ADD_PROJETO)
	public String processItem(@ModelAttribute(AttributeNames.PROJETO) Projeto projeto) {				
		
		if(projeto.getId() != 0) {
			projetoService.updateItem(projeto);
		}
		projetoService.addItem(projeto);
						
		return "redirect:/" + Mappings.PROJETOS;
	}
	
	@GetMapping(Mappings.DELETE_PROJETO)
	public String deleteItem(@RequestParam int id) {
		projetoService.removeItem(id);
		return "redirect:/" + Mappings.PROJETOS;
	}
	
	
}
