
package academy.learnprogramming.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Nonnull;

import academy.learnprogramming.model.Pessoa;
import academy.learnprogramming.model.Projeto;
import edu.emory.mathcs.backport.java.util.Collections;

public class PessoaDAO {

	// == fields ==
	private static int idValue = 1;
	
	private final List<Pessoa> pessoas= new ArrayList<>();
	
	public PessoaDAO() {
	}
	
	// == public methods --
	public List<Projeto> getItems(){
		return Collections.unmodifiableList(pessoas);	
	}
	
	public void addItem(@Nonnull Pessoa toAdd) {
		
		/*if(toAdd == null) {
			throw new NullPointerException("toAdd is a required parameter.");
		}*/
		toAdd.setId(idValue);
		pessoas.add(toAdd);
		idValue++;
	}
	
	public void removeItem(int id) {
		ListIterator<Pessoa> itemIterator = pessoas.listIterator();
		while(itemIterator.hasNext()) {
			Pessoa item = itemIterator.next();
			
			if(item.getId() == id) {
				itemIterator.remove();
				break;
			}
		}
	}
	
	
	
	public Pessoa getItem(int id) {
		for(Pessoa pessoa: pessoas) {
			if(pessoa.getId() == id) {
				return pessoa;
			}
		}
		return null;
	}
	
	public void updateItem(@Nonnull Pessoa toUpdate) {
		ListIterator<Pessoa> projetoIterator = pessoas.listIterator();
		while(projetoIterator.hasNext()) {
			Pessoa pessoa = projetoIterator.next();
			
			if(pessoa.equals(toUpdate)) {
				projetoIterator.set(toUpdate);
				break;
			}
		}	
	}
	
}
