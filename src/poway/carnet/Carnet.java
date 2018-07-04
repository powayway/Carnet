package poway.carnet;
import java.util.Scanner;

public class Carnet {
	
	
	
	private static Scanner sc;

	public static void main ( String [] args ) {
	
		System.out.println("Menu Carnet");
		System.out.println("1. Afficher liste");
		System.out.println("2. Ajouter Personne");
		System.out.println("3. Supprimer Personne");
		System.out.println("0. Quitter");
		
		sc = new Scanner(System.in);
		int choix = sc.nextInt();
		while (choix!=0) {
			switch (choix) {
				case 1:
			
					break;
				case 2:
					ajout();
					break;
				case 3:
					
					break;
				case 0:
			
					break;
				default:
					System.out.println("Veuillez choisir une des options");
					break;
			}
		}
		
	}

	private static void ajout() {
		System.out.println("Entrer le Nom, Prenom, Numero et email de la personne à ajouter");
		sc = new Scanner(System.in);
		String nom = sc.nextLine();
		
	}
	
}
