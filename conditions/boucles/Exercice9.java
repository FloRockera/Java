package fr.conditions.boucles;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {

/* Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche
 * le plus grand de ces nombres. */
		
		Scanner scan = new Scanner(System.in);	
		int[] array4 = new int[10];

		for (int i=0; i<array4.length; i++) {
			System.out.println("Veuillez entrer le nombre n°" + (i+1) +":");
			array4[i] = scan.nextInt();

			System.out.println("----- Plus grande valeur -----");
			int max=array4[0];
			for(int i=0; i<array4.length; i++) {
				if (max < array4[i])
					max = array4[i];
			}
			System.out.println(max);

			scan.close();

		}

	}
