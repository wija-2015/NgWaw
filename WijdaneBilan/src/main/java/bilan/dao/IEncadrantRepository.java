package bilan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import bilan.entities.Collaborateur;
import bilan.entities.Encadrant;
import bilan.entities.Managerrh;

public interface IEncadrantRepository extends JpaRepository<Encadrant, Long>{
	
	
	@Query("select e from Encadrant e where e.idEncadrant like :x")
	public Encadrant findEncadrant(@Param("x")int id);
	
	@Modifying
	@Transactional
	@Query("delete Encadrant c where c.idEncadrant = ?1")
	public int deleteEncadrant(int id);
	
	@Modifying
	@Transactional
	@Query("update Encadrant c set c.nomUser= :nom, c.prenomUser= :prenom where c.idEncadrant = :x")
	public int updateEncadrant(@Param("nom")String nom,@Param("prenom")String prenom,@Param("x")int id);
	
	@Query("select c.nomUser,c.mailUser from Collaborateur c, EvaluationObjectif ev where ev.encadrant.idEncadrant like :x and c.idCollaborateur= ev.collaborateur.idCollaborateur")
	public List<Collaborateur> findEncadrantCollabs(@Param("x")int id);
	
	@Query("select e.idEncadrant, e.prenomUser, e.nomUser, e.matriculeUser, e.mailUser, p.idProfil, p.nomProfil from Encadrant e, Profil p where e.profil.idProfil=p.idProfil")
	public List<Encadrant> findAllEncadrants();

	//public List<Managerrh> findAll();
	
}
