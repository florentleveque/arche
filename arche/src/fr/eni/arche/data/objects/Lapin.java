package fr.eni.arche.data.objects;

import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.interfaces.CalculInstance;

public class Lapin extends Annimal {
	private static int nombreInstance;


	public Lapin(Sexe sexe, String nom) {
		super(sexe, nom);
		// TODO Auto-generated constructor stub
		nombreInstance++;
	}
	public static int getNombreInstance() {
		return nombreInstance;
	}

}
