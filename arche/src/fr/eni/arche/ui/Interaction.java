package fr.eni.arche.ui;

import java.util.Scanner;

import fr.eni.arche.data.enumerations.Espece;
import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.objects.Annimal;
import fr.eni.arche.data.objects.Chat;
import fr.eni.arche.data.objects.Chien;
import fr.eni.arche.data.objects.Gorille;
import fr.eni.arche.data.objects.Lapin;

public class Interaction {
	private static Scanner scan = new Scanner(System.in);
	public static Annimal creationAnnimal() {
		// Je récupère la saisie de l'utilisateur et je retourne une instance de type Annimal
		Annimal annimal = null;
		System.out.println("quel est ton nom ?");
		String nom = scan.nextLine();
		// Je déclare les menus espèce et sexe
		Espece[] especes = Espece.values();
		Sexe[] sexes = Sexe.values();
		System.out.println("Quel est ton sexe ?");
		afficheMenu(sexes);
		short sexe = scan.nextShort();
		System.out.println("quelle est ton espèce ?");
		afficheMenu(especes);
		short espece = scan.nextShort();
		switch (espece) {
		case 0:
			annimal = new Chat(sexes[sexe], nom);
			break;
			case 1:
				annimal = new Chien(sexes[sexe], nom);
				break;
				case 2:
					annimal = new Gorille(sexes[sexe], nom);
					break;
				case 3:
					annimal = new Lapin(sexes[sexe], nom);

		default:
			// à voir si la sisie est mauvaise
			break;
		}


		return annimal;
	}
	private static void afficheMenu(Object[] menu) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + " pour " + menu[i]);
		}
	}

}
