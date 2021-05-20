package fr.eni.arche.principal;

import fr.eni.arche.data.objects.Annimal;
import fr.eni.arche.data.objects.Arche;
import fr.eni.arche.ui.Interaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuer = true;
		Arche arche = null;
		while (continuer) {
			Annimal annimal = Interaction.creationAnnimal();
			arche = new Arche();
			arche.ajoutAnnimal(annimal);
			continuer = Interaction.relanceSaisie();
		}
		Interaction.afficheContenuArche(arche);

	}

}
