package bilan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.IQualificationRepository;
import bilan.entities.Qualification;

@Service
@Transactional
public class IQualificationServiceImpl implements IQualificationService{
	
	@Autowired
	private IQualificationRepository qualificationRepository;

	@Override
	public List<Qualification> toutsQualifications() {
		// TODO Auto-generated method stub
		return qualificationRepository.findAll();
	}

	@Override
	public Qualification ajouterQualification(Qualification a) {
		// TODO Auto-generated method stub
		return qualificationRepository.save(a);
	}


	@Override
	public int supprimerQualification(int id) {
		// TODO Auto-generated method stub
		return qualificationRepository.deleteQualification(id);
	}

	@Override
	public int modifierQualification(String rem, int id) {
		// TODO Auto-generated method stub
		return qualificationRepository.updateQualification(rem, id);
	}

	public IQualificationRepository getQualificationRepository() {
		return qualificationRepository;
	}

	public void setQualificationRepository(
			IQualificationRepository qualificationRepository) {
		this.qualificationRepository = qualificationRepository;
	}

}
