package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
	
/*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
compris entre 1 et 10 :
		
		
- Si le nombre est supérieur à 10, le programme affiche « Ce nombre est trop grand,
veuillez recommencer », puis redemande un nombre à l’utilisateur.*/

		Scanner scanner = new Scanner(System.in);	

		int nb = 0;

		do {
			System.out.println("Veuillez saisir un nombre entre 1 et 10 : ");
			nb = scanner.nextInt();
			if (nb<1)
				System.out.println("Ce nombre est trop petit, veuillez recommencer : ");
			else if (nb>10)
				System.out.println("Ce nombre est trop grand, veuillez recommencer : ");
		
		} while (nb<1 || nb >10);
		
				System.out.println(nb);
			
		scanner.close();
		

	}

}
