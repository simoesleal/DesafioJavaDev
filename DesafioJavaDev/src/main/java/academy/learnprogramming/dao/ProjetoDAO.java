
package academy.learnprogramming.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Nonnull;

import academy.learnprogramming.model.Projeto;
import edu.emory.mathcs.backport.java.util.Collections;

public class ProjetoDAO {

	// == fields ==
	private static int idValue = 1;
	
	private final List<Projeto> projetos= new ArrayList<>();
	
	public ProjetoDAO() {
	}
	
	// == public methods --
	public List<Projeto> getItems(){
		return Collections.unmodifiableList(projetos);	
	}
	
	public void addItem(@Nonnull Projeto toAdd) {
		
		/*if(toAdd == null) {
			throw new NullPointerException("toAdd is a required parameter.");
		}*/
		toAdd.setId(idValue);
		projetos.add(toAdd);	
		idValue++;
	}
	
	public void removeItem(int id) {
		ListIterator<Projeto> itemIterator = projetos.listIterator();
		while(itemIterator.hasNext()) {
			Projeto item = itemIterator.next();
			
			if(item.getId() == id) {
				itemIterator.remove();
				break;
			}
		}
	}
	
	
	
	public Projeto getItem(int id) {
		for(Projeto projeto: projetos) {
			if(projeto.getId() == id) {
				return projeto;
			}
		}
		return null;
	}
	
	public void updateItem(@Nonnull Projeto toUpdate) {
		ListIterator<Projeto> projetoIterator = projetos.listIterator();
		while(projetoIterator.hasNext()) {
			Projeto projeto = projetoIterator.next();
			
			if(projeto.equals(toUpdate)) {
				projetoIterator.set(toUpdate);
				break;
			}
		}	
	}
	
}
