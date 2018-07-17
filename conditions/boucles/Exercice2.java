package fr.conditions.boucles;

public class Exercice2 {

	public static void main(String[] args) {

		//EXERCICE 2 :
		
		//Soit le tableau suivant:
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		//Calculer la moyenne des éléments du tableau
		
		//faire la somme des éléments puis les diviser par le total array.length
		
		double sumTab = 0;
		for (int i= 0; i < array.length; i++) {
			sumTab += array[i];
		}
		double moyTab = (sumTab/array.length);
		System.out.println(moyTab);

	}

}
