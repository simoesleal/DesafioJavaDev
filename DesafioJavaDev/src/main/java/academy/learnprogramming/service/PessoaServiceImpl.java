package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

import academy.learnprogramming.dao.PessoaDAO;
import academy.learnprogramming.dao.ProjetoDAO;
import academy.learnprogramming.model.Pessoa;
import academy.learnprogramming.model.Projeto;

@Service
public class PessoaServiceImpl implements PessoaService{

	// == fields ==
	private final PessoaDAO data = new PessoaDAO();
	
	// == methods ==	
	@Override
	public void addItem(Pessoa toAdd) {
		data.addItem(toAdd);		
	}

	@Override
	public void removeItem(int id) {
		data.removeItem(id);		
	}

	@Override
	public Pessoa getItem(int id) {
		return data.getItem(id);
	}

	@Override
	public void updateItem(Pessoa toUpdate) {
		data.updateItem(toUpdate);
	}

	@Override
	public PessoaDAO getData() {
		return data;
	}
	
}
