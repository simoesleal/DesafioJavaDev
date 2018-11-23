package academy.learnprogramming.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Nonnull;

import academy.learnprogramming.model.Item;
import edu.emory.mathcs.backport.java.util.Collections;

public class ItemDAO {

	// == fields ==
	private static int idValue = 1;
	
	private final List<Item> items = new ArrayList<>();
	
	public ItemDAO() {
		// add some dummy data, using the addItem method so it sets the id field
		addItem(new Item(1, "first", "first details", LocalDate.now()));
		addItem(new Item(2, "second", "second details", LocalDate.now()));
		addItem(new Item(3, "third", "third details", LocalDate.now()));
		addItem(new Item(4, "fourth", "fourth details", LocalDate.now()));			
	}
	
	// == public methods --
	public List<Item> getItems(){
		return Collections.unmodifiableList(items);	
	}
	
	public void addItem(@Nonnull Item toAdd) {
		
		/*if(toAdd == null) {
			throw new NullPointerException("toAdd is a required parameter.");
		}*/
		toAdd.setId(idValue);
		items.add(toAdd);	
		idValue++;
	}
	
	public void removeItem(int id) {
		ListIterator<Item> itemIterator = items.listIterator();
		while(itemIterator.hasNext()) {
			Item item = itemIterator.next();
			
			if(item.getId() == id) {
				itemIterator.remove();
				break;
			}
		}
	}
	
	public Item getItem(int id) {
		for(Item item: items) {
			if(item.getId() == id) {
				return item;
			}
		}
		return null;
	}
	
	public void updateItem(@Nonnull Item toUpdate) {
		ListIterator<Item> itemIterator = items.listIterator();
		while(itemIterator.hasNext()) {
			Item item = itemIterator.next();
			
			if(item.equals(toUpdate)) {
				itemIterator.set(toUpdate);
				break;
			}
		}	
	}
	
}
