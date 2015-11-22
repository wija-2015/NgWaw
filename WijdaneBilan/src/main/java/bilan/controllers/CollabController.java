package bilan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bilan.dao.ICollabRepository;
import bilan.entities.Collaborateur;
import bilan.service.ICollabService;

@RestController
@RequestMapping("collaborateurs")
public class CollabController {

@Autowired
private ICollabService collabService;

@ResponseBody
@RequestMapping(value="findAll", method = RequestMethod.GET)
public List<Collaborateur> getCollabs(){
return  collabService.toutsCollabs();
}
@RequestMapping(value="save", method = RequestMethod.POST)
public Collaborateur saveCollab(@RequestBody Collaborateur c){
	collabService.ajouterCollab(c);
	System.out.println(c.toString()+"  wijdane ");
return c;
}
@RequestMapping(value="/{id}", method = RequestMethod.GET)
public Collaborateur findCollab(@PathVariable("id") int id){
	return collabService.trouverCollab(id);
}
@RequestMapping(value="/update/{id}/{nom}/{prenom}", method = RequestMethod.PUT)
public int updateCollab(@PathVariable("nom") String nom,@PathVariable("prenom") String prenom,@PathVariable("id") int id){
	 return collabService.modifierCollab(nom, prenom, id);
}
@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
public int deleteCollab(@PathVariable("id") int id){
   return collabService.supprimerCollab(id);
}
/*@RequestMapping(value="/add")
public Client addClient(ClientDTO clientDTO)
{
	Client c  = new Client();
	c.setNomClient(clientDTO.getNom());
	c.setPrenomClient(clientDTO.getPrenom());

	//c = clientService.save(c);
	return c;
	
}*/

/*
@RequestMapping("/produits")
public Page<Produit> getProduits(int page){
return produitRepository.findAll(new PageRequest(page, 5));
}
@RequestMapping("/produitsParMC")
public Page<Produit> getProduits(String mc,int page){
return produitRepository.produitParMC("%"+mc+"%", new PageRequest(page, 5));
}
@RequestMapping("/get")
public Produit getProduit(Long ref){
return produitRepository.findOne(ref);
}
@RequestMapping("/delete")
public boolean delete(Long ref){
produitRepository.delete(ref);
return true;
}
@RequestMapping("/update")
public Produit update(Produit p){
produitRepository.saveAndFlush(p);
return p;
}*/
public ICollabService getCollabService() {
	return collabService;
}
public void setCollabService(ICollabService collabService) {
	this.collabService = collabService;
}

}

