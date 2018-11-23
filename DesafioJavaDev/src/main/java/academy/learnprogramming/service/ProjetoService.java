package academy.learnprogramming.service;

import academy.learnprogramming.dao.ProjetoDAO;
import academy.learnprogramming.model.Projeto;

public interface ProjetoService {

	void addItem(Projeto toAdd);
	
	void removeItem(int id);
	
	Projeto getItem(int id);
	
	void updateItem(Projeto toUpdate);
	
	ProjetoDAO getData();
	
}
