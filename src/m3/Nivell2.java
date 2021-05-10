package m3;

import java.util.Scanner;

public class Nivell2 {
//NIVELL 2
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int[][] notes = new int[5][3];
	
		for(int z = 0; z < 5; z++) {
			for(int i = 0; i < 3; i++) {
				System.out.println("Introdueix la nota " + (i+1) + " per a l'alumne " + (z+1));
				int nota = sc.nextInt();
				while(nota < 0 || nota > 10) {
					System.out.println("Introdueix una nota entre el 0 i el 10.");
					nota = sc.nextInt();
				}
				notes[z][i] = nota;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			int mitja = (notes[i][0] + notes[i][1] + notes [i][2]) / 3;
			if(mitja < 5) {
				System.out.println("L'alumne " + (i+1) + " ha suspés amb un " + mitja);
			} else {
				System.out.println("L'alumne " + (i+1) + " ha aprovat amb un " + mitja);
			}
			
		}
		
		
		sc.close();
	}
}
