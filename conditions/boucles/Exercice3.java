package fr.conditions.boucles;

public class Exercice3 {

	public static void main(String[] args) {

		//EXERCICE 3 :

		//Soit le tableau suivant:
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

		//Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux

		//Il faut faire une boucle imbriquée
		int nb = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (i == j) nb++;
			}		
		}
		System.out.println(nb);

	}

}
