package bilan.service;

import java.util.List;

import bilan.entities.Qualification;

public interface IQualificationService {
	
	public List<Qualification> toutsQualifications();

	public Qualification ajouterQualification(Qualification a);
	
	//public Qualification trouverQualification(int id);
	
	public int supprimerQualification(int id);
	
	public int modifierQualification(String nom,int id);
	
	//public List<Managerrh> trouverManagers();
	

}
