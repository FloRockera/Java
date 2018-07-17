package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {

/*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
compris entre 1 et 10 */

		Scanner scanner = new Scanner(System.in);	

		int nb = 0;
		
		do {
			System.out.println("Veuillez saisir un nombre entre 1 et 10 : ");
			nb = scanner.nextInt();
		
		// ! tant que je n'ai pas
			
		} while (!(nb>=1 && nb<=10));

		System.out.println("Le nombre sélectionné est : "+ nb);

		scanner.close();

	}

}
