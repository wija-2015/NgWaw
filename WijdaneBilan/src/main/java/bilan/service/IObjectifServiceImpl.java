package bilan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.IEvaluationObjectifRepository;
import bilan.dao.IObjectifRepository;
import bilan.entities.Objectif;

@Service
@Transactional
public class IObjectifServiceImpl implements IObjectifService{
	
	@Autowired
	private IObjectifRepository objectifRepository;

	@Override
	public List<Objectif> toutsObjectifs() {
		// TODO Auto-generated method stub
		return objectifRepository.findAll();
	}

	@Override
	public int supprimerObjectif(int id) {
		// TODO Auto-generated method stub
		return objectifRepository.deleteObjectif(id);
	}

	@Override
	public int modifierObjectif(String desc, int id) {
		// TODO Auto-generated method stub
		return objectifRepository.updateAObjectif(desc, id);
	}

	public IObjectifRepository getObjectifRepository() {
		return objectifRepository;
	}

	public void setObjectifRepository(IObjectifRepository objectifRepository) {
		this.objectifRepository = objectifRepository;
	}


}
