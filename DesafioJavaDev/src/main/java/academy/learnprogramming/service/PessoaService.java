package academy.learnprogramming.service;

import academy.learnprogramming.dao.PessoaDAO;
import academy.learnprogramming.model.Pessoa;
import academy.learnprogramming.model.Projeto;

public interface PessoaService {

	void addItem(Pessoa toAdd);
	
	void removeItem(int id);
	
	Pessoa getItem(int id);
	
	void updateItem(Pessoa toUpdate);
	
	PessoaDAO getData();
	
}
