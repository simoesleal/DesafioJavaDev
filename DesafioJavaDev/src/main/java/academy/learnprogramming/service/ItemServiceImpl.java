package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

import academy.learnprogramming.dao.ItemDAO;
import academy.learnprogramming.model.Item;


@Service
public class ItemServiceImpl implements ItemService{

	// == fields ==
	private final ItemDAO data = new ItemDAO();

	@Override
	public void addItem(Item toAdd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItem(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item getItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Item toUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemDAO getData() {
		// TODO Auto-generated method stub
		return null;
	}




}
