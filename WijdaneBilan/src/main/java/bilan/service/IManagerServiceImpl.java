package bilan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.IManagerRepository;
import bilan.entities.Collaborateur;
import bilan.entities.Managerrh;

@Service
@Transactional
public class IManagerServiceImpl implements IManagerService {
	
    @Autowired
	private IManagerRepository managerRepository;

	@Override
	public List<Managerrh> toutsManagers() {
		return managerRepository.findAllManagers();
	}

	@Override
	public Managerrh ajouterManager(Managerrh c) {
		return managerRepository.save(c);
	}

	@Override
	public Managerrh trouverManager(int id) {
		return managerRepository.findManager(id);
	}
	
	@Override
	public int supprimerManager(int id) {
		return managerRepository.deleteManager(id);
		
	}
	
	@Override
	public int modifierManager(String nom, String prenom, int id) {
		return managerRepository.updateManager(nom, prenom, id);
	}
	
	@Override
	public List<Collaborateur> trouverManagerCollabs(int id) {
		
		return managerRepository.findManagerCollabs(id);
	}

	public IManagerRepository getManagerRepository() {
		return managerRepository;
	}

	public void setManagerRepository(IManagerRepository managerRepository) {
		this.managerRepository = managerRepository;
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

}
