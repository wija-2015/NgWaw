package bilan.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.Collection;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Encadrant implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEncadrant;
	private String mailUser;
	private String matriculeUser;
	private String nomUser;
	private String prenomUser;

	//bi-directional many-to-one association to Profil
	@ManyToOne
	@JoinColumn(name="idProfil")
	private Profil profil;

	//bi-directional many-to-one association to Evaluationobjectif
	@OneToMany(mappedBy="encadrant")
	private Collection<EvaluationObjectif> evaluationobjectifs;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="encadrant")
	private Collection<Feedback> feedbacks;

	public Encadrant() {
	}

	public Encadrant(int idEncadrant) {
		super();
		this.idEncadrant = idEncadrant;
	}
	
	public int getIdEncadrant() {
		return idEncadrant;
	}
	public void setIdEncadrant(int idEncadrant) {
		this.idEncadrant = idEncadrant;
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

	public Profil getProfil() {
		return this.profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public Collection<EvaluationObjectif> getEvaluationobjectifs() {
		return this.evaluationobjectifs;
	}

	public void setEvaluationobjectifs(Collection<EvaluationObjectif> evaluationobjectifs) {
		this.evaluationobjectifs = evaluationobjectifs;
	}

	
	public Collection<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(Collection<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

}