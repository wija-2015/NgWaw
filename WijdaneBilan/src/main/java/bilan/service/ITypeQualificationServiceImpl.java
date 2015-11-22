package bilan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.ITypeQualificationRepository;
import bilan.entities.Typequalification;

@Service
@Transactional
public class ITypeQualificationServiceImpl implements ITypeQualificationService{
	
	@Autowired
	private ITypeQualificationRepository typeQualificationRepository;

	@Override
	public List<Typequalification> toutsTypequalifications() {
		// TODO Auto-generated method stub
		return typeQualificationRepository.findAllTypequalifications();
	}

	@Override
	public Typequalification ajouterTypequalification(Typequalification a) {
		// TODO Auto-generated method stub
		return typeQualificationRepository.save(a);
	}

	@Override
	public Typequalification trouverTypequalification(int id) {
		// TODO Auto-generated method stub
		return typeQualificationRepository.findTypequalification(id);
	}

	@Override
	public int supprimerTypequalification(int id) {
		// TODO Auto-generated method stub
		return typeQualificationRepository.deleteTypequalification(id);
	}

	@Override
	public int modifierTypequalification(String nom, int id) {
		// TODO Auto-generated method stub
		return typeQualificationRepository.updateTypequalification(nom, id);
	}

	public ITypeQualificationRepository getTypeQualificationRepository() {
		return typeQualificationRepository;
	}

	public void setTypeQualificationRepository(
			ITypeQualificationRepository typeQualificationRepository) {
		this.typeQualificationRepository = typeQualificationRepository;
	}
	
	
}
