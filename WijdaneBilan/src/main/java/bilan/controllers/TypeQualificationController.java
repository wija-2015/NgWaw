package bilan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bilan.entities.Typequalification;
import bilan.service.ITypeQualificationService;

@RestController
@RequestMapping("typeQualifications")
public class TypeQualificationController {

@Autowired
private ITypeQualificationService typeQualificationService;

@RequestMapping(value="findAll", method = RequestMethod.GET)
public List<Typequalification> getBaps(){
return typeQualificationService.toutsTypequalifications();
}
@RequestMapping(value="save", method = RequestMethod.GET)
public Typequalification saveBap(Typequalification c){
return typeQualificationService.ajouterTypequalification(c);
}
@RequestMapping(value="/{id}", method = RequestMethod.GET)
public Typequalification findAdmin(@PathVariable("id") int id){
	return typeQualificationService.trouverTypequalification(id);
}
@RequestMapping(value="/update/{id}/{nom}", method = RequestMethod.GET)
public int updateAdmin(@PathVariable("nom") String nom, @PathVariable("id") int id){
	 return typeQualificationService.modifierTypequalification(nom, id);
}
@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
public int deleteManager(@PathVariable("id") int id){
 return typeQualificationService.supprimerTypequalification(id);
}
public ITypeQualificationService getTypeQualificationService() {
	return typeQualificationService;
}
public void setTypeQualificationService(
		ITypeQualificationService typeQualificationService) {
	this.typeQualificationService = typeQualificationService;
}





}
