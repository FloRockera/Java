package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
	
/* Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme
 * de tous les entiers compris entre 1 et ce nombre. */		


		Scanner scan = new Scanner(System.in);	
		System.out.println("Veuillez saisir un nombre : ");
		int nb =scan.nextInt();

		int sum=0;
		for (int i = 0; i <=nb; i++) {
			sum+=i;	
		}


		System.out.println(sum);


		scan.close();
	}

}
