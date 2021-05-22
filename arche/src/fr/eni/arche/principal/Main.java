package fr.eni.arche.principal;

import fr.eni.arche.data.exceptions.ArchePleineException;
import fr.eni.arche.data.objects.Annimal;
import fr.eni.arche.data.objects.Arche;
import fr.eni.arche.ui.Interaction;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arche arche = new Arche();
		boolean continuer = true;
		try {
			while (continuer) {
				Annimal annimal = Interaction.creationAnnimal();
				if (annimal != null) {
					arche.ajoutAnnimal(annimal);
				}
				continuer = Interaction.relanceSaisie();
			}
		} catch (ArchePleineException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		Interaction.afficheContenuArche(arche);
		Interaction.affichePreparation(arche);

	}
}
