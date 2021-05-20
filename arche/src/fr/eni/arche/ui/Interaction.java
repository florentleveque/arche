package fr.eni.arche.ui;

import java.util.Scanner;

import fr.eni.arche.data.enumerations.Espece;
import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.objects.Annimal;
import fr.eni.arche.data.objects.Arche;
import fr.eni.arche.data.objects.Chat;
import fr.eni.arche.data.objects.Chien;
import fr.eni.arche.data.objects.Gorille;
import fr.eni.arche.data.objects.Lapin;

/**
 * @author Florent
 * Cette classe gère l'interaction avec l'utilisateur
 */
public class Interaction {
	private static Scanner scan = new Scanner(System.in);
	/**
	 * Cette méthode récupère les informations saisie par l'utilisateur
	 * @return une instance d'une classe héritant de la classe Annimal
	 */
	public static Annimal creationAnnimal() {
		// Je récupère la saisie de l'utilisateur et je retourne une instance de type Annimal
		Annimal annimal = null;
		System.out.println("quel est le nom ?");
		String nom = scan.nextLine();
		// Je déclare les menus espèce et sexe
		Espece[] especes = Espece.values();
		Sexe[] sexes = Sexe.values();
		System.out.println("Quel est le sexe ?");
		afficheMenu(sexes);
		short sexe = scan.nextShort();
		System.out.println("quelle est l'espèce ?");
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
			// à voir si la saisie est mauvaise
			break;
		}
		scan.nextLine();


		return annimal;
	}
	/**
	 * Cette méthode affiche un menu via un tableau passé en paramètre
	 * @param menu
	 */
	private static void afficheMenu(Object[] menu) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + " pour " + menu[i]);
		}
	}
	/**
	 * @param arche
	 * Cette méthode affiche le nombre d'annimaaux par espèce
	 */
	public static void afficheContenuArche(Arche arche) {
		System.out.printf("L'arche compte : %n %d lapin(s), %d chien(s), %d chats(s), et %d gorilles", Lapin.getNombreInstance(), Chien.getNombreInstance(), Chat.getNombreInstance(), Gorille.getNombreInstance());
	}
	public static boolean relanceSaisie() {
		boolean relance = false;
		System.out.println("Souhaite-tu entrer un autre annimal ?");
		char reponse = scan.nextLine().charAt(0);
		if (reponse == 'o' || reponse == 'O') {
			relance = true;
		}
		return relance;
	}

}
