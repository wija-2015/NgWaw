package bilan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import bilan.entities.Typequalification;
//import bilan.entities.Managerrh;
import bilan.entities.Typequalification;

public interface ITypeQualificationRepository extends JpaRepository<Typequalification, Long>{
	
	@Query("select a from Typequalification a where a.idTypeQ like :x")
	public Typequalification findTypequalification(@Param("x")int id);
	
	@Modifying
	@Transactional
	@Query("delete Typequalification a where a.idTypeQ = ?1")
	public int deleteTypequalification(int id);
	
	@Modifying
	@Transactional
	@Query("update Typequalification a set a.nomTypeQ= :nom where a.idTypeQ = :x")
	public int updateTypequalification(@Param("nom")String nom,@Param("x")int id);
	
	@Query("select m.nomTypeQ from Typequalification m")
	public List<Typequalification> findAllTypequalifications();
	
	//public List<Admin> findAll();
	
}

