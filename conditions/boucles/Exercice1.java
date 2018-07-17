package fr.conditions.boucles;

public class Exercice1 {

	public static void main(String[] args) {

		int a = 5;
		//exemple de l'utilisation de Switch
		switch (a) {
		case 5 : System.out.println("Bonjour");
		break; // pour sortir de la boucle sinon exécute toutes les instructions jusqu'à trouver un break
		case 7 : System.out.println("Hello");
		break;
		default:
			System.out.println("Au revoir");
			break;
		}

		//EXERCICE1

		//Soit le tableau suivant:
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


		//Afficher l'ensemble des éléments dans l'ordre normal
		//array.length c'est la longueur du tableau, on parcourt le tableau en connaissant sa taille
		for (int i= 0; i < array.length; i++) { 
			System.out.println(array[i]);
		}

		//Afficher l'ensemble des éléments dans l'ordre inverse
		//array.length-1 on prend le dernier index du tableau
		for (int i= array.length-1; i>0; i--) { 
			System.out.println(array[i]);
		}

		//Combiner boucle + test pour afficher entiers sup à 3
		for (int i= 0; i < array.length; i++) { //parcourir tout le tableau
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}

		//Combiner boucle + test pour afficher entiers pairs
		for (int i= 0; i < array.length; i++) {
			if (array[i]%2 == 0) { //essaie de diviser par 2, si le reste est 0 alors c'est bien un nombre pair
				System.out.println(array[i]);
			}
		}

		//Combiner boucle + test pour afficher entiers impairs
		for (int i= 0; i < array.length; i++) {
			if (array[i]%2 != 0) {
				System.out.println(array[i]);
			}
		}	

		//Rechercher le plus grand élément du tableau et le plus petit
		int maxVal = Integer.MIN_VALUE; // Faire partir de la plus petite valeur du tableau
		int minVal = Integer.MAX_VALUE; // Faire partir de la plus haute valeur
		for (int i= 0; i < array.length; i++) {
			if (array[i] < minVal) {
				minVal = array[i];
			}
			if (array[i] > maxVal) {
				maxVal = array[i];
			}
			System.out.println(maxVal);
			System.out.println(minVal);
		}

		
	
	}
}
