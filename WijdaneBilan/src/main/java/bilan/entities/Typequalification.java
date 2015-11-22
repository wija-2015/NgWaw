package bilan.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Collection;

@Entity
public class Typequalification implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTypeQ;
	private String nomTypeQ;
	private int poidsTypeQ;

	//bi-directional many-to-one association to Qualification
	@OneToMany(mappedBy="typequalification")
	private Collection<Qualification> qualifications;

	public Typequalification() {
	}

	public Typequalification(int idTypeQ, String nomTypeQ, int poidsTypeQ,
			Collection<Qualification> qualifications) {
		super();
		this.idTypeQ = idTypeQ;
		this.nomTypeQ = nomTypeQ;
		this.poidsTypeQ = poidsTypeQ;
		this.qualifications = qualifications;
	}

	public int getIdTypeQ() {
		return this.idTypeQ;
	}

	public void setIdTypeQ(int idTypeQ) {
		this.idTypeQ = idTypeQ;
	}

	public String getNomTypeQ() {
		return this.nomTypeQ;
	}

	public void setNomTypeQ(String nomTypeQ) {
		this.nomTypeQ = nomTypeQ;
	}

	public int getPoidsTypeQ() {
		return this.poidsTypeQ;
	}

	public void setPoidsTypeQ(int poidsTypeQ) {
		this.poidsTypeQ = poidsTypeQ;
	}

	public Collection<Qualification> getQualifications() {
		return this.qualifications;
	}

	public void setQualifications(Collection<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	
}