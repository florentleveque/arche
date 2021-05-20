package fr.eni.arche.data.objects;

import fr.eni.arche.data.interfaces.Carnivor;
import fr.eni.arche.data.interfaces.Vegetarien;

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

	public Arche() {
		super();
		annimaux = new Annimal[8];
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
	public int[] trieAnnimaux() {
		// je parcours le tableaux d'annimaux, et je nomme dans le tableau le nombre de carnivors et de végétariens
		int[] trie = new int[2];
		
		// l'index 0 contiendra le nombre de végétarien, et l'index 1 comprendra le nombre de carnivors.
		for (Annimal a : annimaux) {
			if (a instanceof Vegetarien) {
				trie[0]++;
			}
			else if (a instanceof Carnivor) {
				trie[1]++;
			}
		}
		return trie;
	}

}
