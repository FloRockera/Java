package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {


		/* Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris
		 * entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le programme
		 * affiche la table de multiplication de ce nombre. */


		//Récupérer le texte saisi avec le scanner
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10 : ");
		Scanner sc = new Scanner(System.in);


		//Rappel du texte saisi
		int str = sc.nextInt(); //int car on est entre 1 et 10
		System.out.println("Vous avez saisi : " + str);


		// Faire une boucle pour saisir la table de multiplication
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(str+"*"+i+"="+(str*i));
		}

	}

}
