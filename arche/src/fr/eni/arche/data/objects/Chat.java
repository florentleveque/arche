package fr.eni.arche.data.objects;

import fr.eni.arche.data.enumerations.Sexe;

/**
 * @author fleveque2021
 *
 */
public class Chat extends Annimal {
	private static int nombreInstance;
	public Chat(Sexe sexe, String nom) {
		super(sexe, nom);
		// TODO Auto-generated constructor stub
		nombreInstance++;
	}
	public static int getNombreInstance() {
		return nombreInstance;
	}

}
