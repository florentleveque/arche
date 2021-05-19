package fr.eni.arche.data.objects;

import fr.eni.arche.data.enumerations.Sexe;

public abstract class Annimal {
	private Sexe sexe;
	private String nom;
	public Annimal(Sexe sexe, String nom) {
		super();
		this.sexe = sexe;
		this.nom = nom;
	}
	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
