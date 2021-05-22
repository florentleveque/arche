package fr.eni.arche.data.objects;

import java.util.ArrayList;
import fr.eni.arche.data.exceptions.ArchePleineException;
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
	private ArrayList<Annimal> annimaux;

	public Arche() {
		super();
		annimaux = new ArrayList<Annimal>();
	}
	public ArrayList<Annimal> getAnnimaux() {
		return annimaux;
	}

	/**
	 * @param annimal
	 * Cette méthode ajoute un animal à la liste annimaux de la classe Arche
	 */
	public void ajoutAnnimal(Annimal annimal) throws ArchePleineException {
		this.annimaux.add(annimal);
		System.out.println(annimal.getNom() + " a été ajouté à l'arche.");
		System.out.printf("%d / 8", this.annimaux.size());
		if (this.annimaux.size() == 8) {
			throw new ArchePleineException("Il n'y a plus de place dans l'arche");
		}
	}
	public int[] trieAnnimaux() {
		// je parcours la liste d'animaux, et je nomme dans le tableau le nombre de carnivors et de végétariens
		int[] trie = new int[2];

		// l'index 0 contiendra le nombre de végétarien, et l'index 1 comprendra le nombre de carnivors.
		for (int i = 0; i < this.annimaux.size(); i++) {
				if (this.annimaux.get(i) instanceof Vegetarien) {
					trie[0]++;
				}
				else if (this.annimaux.get(i) instanceof Carnivor) {
					trie[1]++;
				}
		}

		return trie;
	}

}
