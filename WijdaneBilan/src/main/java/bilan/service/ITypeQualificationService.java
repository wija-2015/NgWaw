package bilan.service;

import java.util.List;

import bilan.entities.Typequalification;

public interface ITypeQualificationService {

	
	public List<Typequalification> toutsTypequalifications();

	public Typequalification ajouterTypequalification(Typequalification a);
	
	public Typequalification trouverTypequalification(int id);
	
	public int supprimerTypequalification(int id);
	
	public int modifierTypequalification(String nom,int id);
	
	//public List<Managerrh> trouverManagers();
	
}
