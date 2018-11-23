package academy.learnprogramming.service;

import academy.learnprogramming.dao.ItemDAO;
import academy.learnprogramming.model.Item;

public interface ItemService {

	void addItem(Item toAdd);
	
	void removeItem(int id);
	
	Item getItem(int id);
	
	void updateItem(Item toUpdate);
	
	ItemDAO getData();
	
}
