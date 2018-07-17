package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
	
		
/* Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche
 * les 10 nombres suivants. Par exemple si l’utilisateur saisit 5, le
 * programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15. */
		
		//Récupérer le texte saisi avec le scanner
		System.out.println("Veuillez saisir un nombre : ");
		Scanner sc = new Scanner(System.in);
		
		//Afficher les 10 nombres suivants
		int str = sc.nextInt();
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(str+i);
		}

		
	}

}
