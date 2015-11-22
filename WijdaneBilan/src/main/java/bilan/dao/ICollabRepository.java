package bilan.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import bilan.entities.Collaborateur;


public interface ICollabRepository extends JpaRepository<Collaborateur, Long> {
	
	//@Query("select p from Admin p where p.nom like :x")
	//public Page<User> produitParMC(@Param("x")String mc,Pageable p);
	
	@Query("select c from Collaborateur c where c.idCollaborateur like :x")
	public Collaborateur findCollab(@Param("x")int id);
	
	@Modifying
	@Transactional
	@Query("delete Collaborateur c where c.idCollaborateur = ?1")
	public int deleteCollab(int id);
	
	@Modifying
	@Transactional
	@Query("update Collaborateur c set c.nomUser= :nom, c.prenomUser= :prenom where c.idCollaborateur = :x")
	public int updateCollab(@Param("nom")String nom,@Param("prenom")String prenom,@Param("x")int id);
	
	//public List<Collaborateur> findAll();
	

	@Query("select c.nomUser as nom,c.prenomUser as prenom, c.matriculeUser as matric,c.dateRecrutement as date, c.mailUser as mail, m.nomUser as nomRH, m.prenomUser as prenomRH from Collaborateur c, Managerrh m where m.idManagerrh=c.managerrh.idManagerrh")
	public List<Collaborateur> findAllCollabs();
	
	//@Query("insert into User (id, name) select c.id, c.name from Customer c where ...")
	//public User updateUser(@Param("nom")String nom,@Param("prenom")String prenom);

	
	//public List<User> findByNomUser(String des);
	//public User findOne(String nom); 

}