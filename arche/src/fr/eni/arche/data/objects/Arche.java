package fr.eni.arche.data.objects;

/**
 * @author florent
 * Cette classe représente l'arche
 * Elle contient les attributs suivants :
 */
/**
 * @author fleveque2021
 *
 */
/**
 * @author fleveque2021
 *
 */
public class Arche {
	private Annimal[] annimaux;
	public static int nbLapin;
	public static int nbGorille;
	public static int nbChat;
	public static int nbChien;

	public Arche() {
		super();
		annimaux = new Annimal[8];
		nbChat = 0;
		nbChien = 0;
		nbLapin = 0;
		nbGorille = 0;
	}
	public Annimal[] getAnnimaux() {
		return annimaux;
	}

	/**
	 * @param annimal
	 * Cette méthode ajoute un annimal au tableau annimaux à la classe Arche
	 */
	public void ajoutAnnimal(Annimal annimal) {
		for (int i = 0; i < annimaux.length; i++) {
			if (annimaux[i] == null) {
				annimaux[i] = annimal;
				System.out.println(annimaux[i].getNom() + " a été ajouté à l'arche.");
				break;
			}
		}
	}

}
