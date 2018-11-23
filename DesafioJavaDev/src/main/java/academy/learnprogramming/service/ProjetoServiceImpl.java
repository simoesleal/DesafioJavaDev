package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

import academy.learnprogramming.dao.ProjetoDAO;
import academy.learnprogramming.model.Projeto;

@Service
public class ProjetoServiceImpl implements ProjetoService{

	// == fields ==
	private final ProjetoDAO data = new ProjetoDAO();
	
	// == methods ==	
	@Override
	public void addItem(Projeto toAdd) {
		data.addItem(toAdd);		
	}

	@Override
	public void removeItem(int id) {
		data.removeItem(id);		
	}

	@Override
	public Projeto getItem(int id) {
		return data.getItem(id);
	}

	@Override
	public void updateItem(Projeto toUpdate) {
		data.updateItem(toUpdate);
	}

	@Override
	public ProjetoDAO getData() {
		return data;
	}


}
