package fr.eni.arche.data.objects;

import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.interfaces.Carnivor;

public class Chien extends Annimal implements Carnivor {
	private static int nombreInstance;

	public Chien(Sexe sexe, String nom) {
		super(sexe, nom);
		// TODO Auto-generated constructor stub
		nombreInstance++;
		besoin = nombreInstance * QUANTITE_DE_VIANDE_PAR_JOUR;
	}
	public static int getNombreInstance() {
		return nombreInstance;
	}


}
