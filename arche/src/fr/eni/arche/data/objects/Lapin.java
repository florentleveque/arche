package fr.eni.arche.data.objects;

import java.util.Calendar;

import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.interfaces.Vegetarien;

public class Lapin extends Annimal implements Vegetarien {
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
