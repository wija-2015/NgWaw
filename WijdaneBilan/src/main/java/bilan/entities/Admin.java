package bilan.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Admin implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAdmin;
	private String mailUser;
	private String matriculeUser;
	private String nomUser;
	private String prenomUser;

	public Admin() {
	}

	public Admin(int idAdmin) {
		super();
		this.idAdmin = idAdmin;
	}
	
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getMatriculeUser() {
		return matriculeUser;
	}

	public void setMatriculeUser(String matriculeUser) {
		this.matriculeUser = matriculeUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	
}