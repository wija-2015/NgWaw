package bilan.service;

import java.util.List;

import bilan.entities.Collaborateur;


public interface ICollabService {

	
	public List<Collaborateur> toutsCollabs();

	public Collaborateur ajouterCollab(Collaborateur c);
	
	public Collaborateur trouverCollab(int id);
	
	public int supprimerCollab(int id);
	
	public int modifierCollab(String nom, String prenom,int id);
	

	/*public User getUserById(Long id);

	void deleteUser(Long id);
	
	//List<User> findClientbyPromotion(Long id);
	
	void save (User client);*/
	
}