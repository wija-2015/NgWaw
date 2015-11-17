package bilan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import bilan.entities.Collaborateur;
import bilan.entities.Managerrh;

public interface IManagerRepository extends JpaRepository<Managerrh, Long>{
	
	
	@Query("select c from Managerrh c where c.idManagerrh like :x")
	public Managerrh findManager(@Param("x")int id);
	
	@Modifying
	@Transactional
	@Query("delete Managerrh c where c.idManagerrh = ?1")
	public int deleteManager(int id);
	
	@Modifying
	@Transactional
	@Query("update Managerrh c set c.nomUser= :nom, c.prenomUser= :prenom where c.idManagerrh = :x")
	public int updateManager(@Param("nom")String nom,@Param("prenom")String prenom,@Param("x")int id);
	
	@Query("select c.nomUser,c.mailUser from Collaborateur c, Managerrh m where m.idManagerrh like :x and m.idManagerrh= c.managerrh.idManagerrh")
	public List<Collaborateur> findManagerCollabs(@Param("x")int id);

	public List<Managerrh> findAll();
	
}
