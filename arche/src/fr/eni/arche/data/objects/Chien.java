package fr.eni.arche.data.objects;

import fr.eni.arche.data.enumerations.Sexe;

public class Chien extends Annimal{
	private static int nombreInstance;

	public Chien(Sexe sexe, String nom) {
		super(sexe, nom);
		// TODO Auto-generated constructor stub
		nombreInstance++;
	}
	public static int getNombreInstance() {
		return nombreInstance;
	}

}
