package bilan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bilan.entities.Objectif;
import bilan.service.IObjectifService;

@RestController
@RequestMapping("objectifs")
public class ObjectifController {

@Autowired
private IObjectifService objectifService;

@RequestMapping(value="findAll", method = RequestMethod.GET)
public List<Objectif> getObjectifs(){
return objectifService.toutsObjectifs();
}
@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
public int deleteObjectif(@PathVariable("id") int id){
   return objectifService.supprimerObjectif(id);
}
/*@RequestMapping(value="save", method = RequestMethod.GET)
public Objectif saveBap(Objectif c){
return objectifService.
}
@RequestMapping(value="/{id}", method = RequestMethod.GET)
public Objectif findAdmin(@PathVariable("id") int id){
	return objectifService.trouverBap(id);
}
@RequestMapping(value="/update/{id}/{desc}", method = RequestMethod.GET)
public int updateAdmin(@PathVariable("desc") String desc, @PathVariable("id") int id){
	 return objectifService.modifierObjectif(desc, id);
}*/

public IObjectifService getObjectifService() {
	return objectifService;
}
public void setObjectifService(IObjectifService objectifService) {
	this.objectifService = objectifService;
}

}
