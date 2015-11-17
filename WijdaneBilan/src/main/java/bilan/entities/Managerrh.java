package bilan.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.Collection;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Managerrh implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idManagerrh;
	private String mailUser;
	private String matriculeUser;
	private String nomUser;
	private String prenomUser;

	//bi-directional many-to-one association to Collaborateur
	@JsonManagedReference
	@OneToMany(mappedBy="managerrh")
	private Collection<Collaborateur> collaborateurs;

	public Managerrh() {
	}

	public Managerrh(int idManagerrh) {
		super();
		this.idManagerrh = idManagerrh;
	}

	public int getIdManagerrh() {
		return idManagerrh;
	}

	public void setIdManagerrh(int idManagerrh) {
		this.idManagerrh = idManagerrh;
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

	public Collection<Collaborateur> getCollaborateurs() {
		return this.collaborateurs;
	}

	public void setCollaborateurs(Collection<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
}