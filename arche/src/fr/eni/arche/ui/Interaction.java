package fr.eni.arche.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.eni.arche.data.enumerations.Espece;
import fr.eni.arche.data.enumerations.Sexe;
import fr.eni.arche.data.interfaces.Carnivor;
import fr.eni.arche.data.interfaces.Vegetarien;
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
	public static final String SAISIE_INVALIDE = "Format de saisie invalide, l'annimal ne sera pas ajouté à l'arche";
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

		try {
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
				System.out.println(SAISIE_INVALIDE + " (espèce).");
				// à voir si la saisie est mauvaise
				break;
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(SAISIE_INVALIDE + " (sexe)");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(SAISIE_INVALIDE);
			// TODO: handle exception
		}
		finally {
			scan.nextLine();
		}
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
	/**
	 * Cette méthode est chargé d'afficher dans la console ce que doit préparer le commis pour effectuer le voyage
	 */
	public static void affichePreparation(Arche arche) {
		int traverse = 10;
		int[] tri = arche.trieAnnimaux();
		int vegetariens = tri[0];
		int carnivors = tri[1];
		int vegetaux = vegetariens * Vegetarien.NOMBRE_DE_VEGETAUX_PAR_JOUR * traverse;
		int viande = tri[1] * Carnivor.QUANTITE_DE_VIANDE_PAR_JOUR * traverse;
		System.out.printf("%n Le commis doit préparer %d kg de viandes, et %d végétaux.", viande, vegetaux);
	}

}
