package academy.learnprogramming.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import academy.learnprogramming.dao.ItemDAO;
import academy.learnprogramming.dao.ProjetoDAO;
import academy.learnprogramming.model.Item;
import academy.learnprogramming.model.Projeto;
import academy.learnprogramming.service.ItemService;
import academy.learnprogramming.service.ProjetoService;
import academy.learnprogramming.util.AttributeNames;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;

@Controller
public class ItemController {
	
	// == fields ==
	private final ItemService itemService;
	
	// == constructor ==
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	// == model attribute ==	
	@ModelAttribute
	public ItemDAO itemDao() {
		return itemService.getData();
	}

	
	@GetMapping(Mappings.ITEMS)
	public String items() {
		return ViewNames.ITENS;
	}
	
	@GetMapping(Mappings.ADD_ITEM)
	public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {
		Item item= itemService.getItem(id);
		
		if(item == null) {
			item = new Item();
		}
		model.addAttribute(AttributeNames.ITEM, item);
		return ViewNames.ADD_ITEM;
	}
	
	@PostMapping(Mappings.ADD_ITEM)
	public String processItem(@ModelAttribute(AttributeNames.ITEM) Item item) {				
		
		if(item.getId() != 0) {
			itemService.updateItem(item);
		}
		itemService.addItem(item);
						
		return "redirect:/" + Mappings.ITEMS;
	}
	
	@GetMapping(Mappings.DELETE_ITEM)
	public String deleteItem(@RequestParam int id) {
		itemService.removeItem(id);
		return "redirect:/" + Mappings.ITEMS;
	}
	
	
}
