package bilan.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Qualification implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idQualification;
	private String remarque;

	//bi-directional many-to-one association to Feedback
	@ManyToOne
	@JoinColumn(name="idFeedback")
	private Feedback feedback;

	//bi-directional many-to-one association to Theme
	@ManyToOne
	@JoinColumn(name="idTheme")
	private Theme theme;

	//bi-directional many-to-one association to Typequalification
	@ManyToOne
	@JoinColumn(name="idTypeQ")
	private Typequalification typequalification;

	public Qualification() {
	}

	public Qualification(int idQualification, String remarque,
			Feedback feedback, Theme theme, Typequalification typequalification) {
		super();
		this.idQualification = idQualification;
		this.remarque = remarque;
		this.feedback = feedback;
		this.theme = theme;
		this.typequalification = typequalification;
	}

	public int getIdQualification() {
		return idQualification;
	}

	public void setIdQualification(int idQualification) {
		this.idQualification = idQualification;
	}

	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public Feedback getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Theme getTheme() {
		return this.theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Typequalification getTypequalification() {
		return this.typequalification;
	}

	public void setTypequalification(Typequalification typequalification) {
		this.typequalification = typequalification;
	}
}