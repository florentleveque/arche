package fr.eni.arche.principal;

import fr.eni.arche.data.objects.Annimal;
import fr.eni.arche.ui.Interaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annimal annimal = Interaction.creationAnnimal();
		System.out.printf("%s a été créé", annimal.getNom());

	}

}
