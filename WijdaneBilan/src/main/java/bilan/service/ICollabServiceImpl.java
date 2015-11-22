package bilan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.ICollabRepository;
import bilan.entities.Collaborateur;

@Service
@Transactional
public class ICollabServiceImpl implements ICollabService {
	
    @Autowired
	private ICollabRepository collabRepository;

	@Override
	public List<Collaborateur> toutsCollabs() {
		return collabRepository.findAllCollabs();
		//return collabRepository.findAll();
	}

	@Override
	public Collaborateur ajouterCollab(Collaborateur c) {
		return collabRepository.save(c);
	}

	@Override
	public Collaborateur trouverCollab(int id) {
		return collabRepository.findCollab(id);
	}
	
	@Override
	public int supprimerCollab(int id) {
		return collabRepository.deleteCollab(id);
		
	}
	
	@Override
	public int modifierCollab(String nom, String prenom, int id) {
		return collabRepository.updateCollab(nom, prenom, id);
	}

	/*@Override
	public void saveClient(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(User client) {
		// TODO Auto-generated method stub
		
	}
*/
	public ICollabRepository getCollabRepository() {
		return collabRepository;
	}

	public void setCollabRepository(ICollabRepository collabRepository) {
		this.collabRepository = collabRepository;
	}

}
