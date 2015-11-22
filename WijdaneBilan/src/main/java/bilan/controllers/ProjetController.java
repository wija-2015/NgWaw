package bilan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bilan.entities.Projet;
import bilan.service.IProjetService;

@RestController
@RequestMapping("projets")
public class ProjetController {

@Autowired
private IProjetService projetService;

@RequestMapping(value="findAll", method = RequestMethod.GET)
public List<Projet> getProjets(){
return projetService.toutsProjets();
}
@RequestMapping(value="save", method = RequestMethod.GET)
public Projet saveBap(Projet c){
return projetService.ajouterProjet(c);
}
@RequestMapping(value="/{id}", method = RequestMethod.GET)
public Projet findAdmin(@PathVariable("id") int id){
	return projetService.trouverProjet(id);
}
@RequestMapping(value="/update/{id}/{nom}", method = RequestMethod.GET)
public int updateAdmin(@PathVariable("nom") String nom, @PathVariable("id") int id){
	 return projetService.modifierProjet(nom, id);
}
@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
public int deleteManager(@PathVariable("id") int id){
   return projetService.supprimerProjet(id);
}
public IProjetService getProjetService() {
	return projetService;
}
public void setProjetService(IProjetService projetService) {
	this.projetService = projetService;
}



}
