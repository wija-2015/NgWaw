package bilan.service;

import java.util.List;

import bilan.entities.Objectif;

public interface IObjectifService {
	
	public List<Objectif> toutsObjectifs();

	//public Managerrh ajouterManager(Objectif c);
	
	//public Managerrh trouverManager(int id);
	
	public int supprimerObjectif(int id);
	
	public int modifierObjectif(String desc, int id);
	

}
