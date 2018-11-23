package academy.learnprogramming.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import academy.learnprogramming.dao.PessoaDAO;
import academy.learnprogramming.model.Pessoa;
import academy.learnprogramming.service.PessoaService;
import academy.learnprogramming.util.AttributeNames;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;

@Controller
public class PessoaController {
	
	// == fields ==
	private final PessoaService pessoaService;
	
	// == constructor ==
	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	// == model attribute ==	
	@ModelAttribute
	public PessoaDAO pessoaDao() {
		return pessoaService.getData();
	}
	
	@GetMapping(Mappings.PESSOAS)
	public String items() {
		return ViewNames.PESSOAS;
	}
	
	@GetMapping(Mappings.ADD_PESSOA)
	public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {
		Pessoa pessoa = pessoaService.getItem(id);
		
		if(pessoa == null) {
			pessoa = new Pessoa();
		}
		model.addAttribute(AttributeNames.PESSOA, pessoa);
		return ViewNames.ADD_PESSOA;
	}
	
	@PostMapping(Mappings.ADD_PESSOA)
	public String processItem(@ModelAttribute(AttributeNames.PESSOA) Pessoa pessoa) {				
		
		if(pessoa.getId() != 0) {
			pessoaService.updateItem(pessoa);
		}
		pessoaService.addItem(pessoa);
						
		return "redirect:/" + Mappings.PESSOAS;
	} 
	
	@GetMapping(Mappings.DELETE_PESSOA)
	public String deleteItem(@RequestParam int id) {
		pessoaService.removeItem(id);
		return "redirect:/" + Mappings.PESSOAS;
	}
	
	
}
