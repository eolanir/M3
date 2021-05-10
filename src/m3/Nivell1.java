package m3;

import java.util.Arrays;
import java.util.Scanner;

public class Nivell1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//NIVELL 1
		//Fase 1
		System.out.println("NIVELL 1");
		System.out.println("Fase 1");
		
		String cit1 = "";
		String cit2 = "";
		String cit3 = "";
		String cit4 = "";
		String cit5 = "";
		String cit6 = "";
		
		System.out.println("Introdueix el nom de la primera ciutat.");
		cit1 = sc.nextLine();
		
		System.out.println("Segona ciutat");
		cit2 = sc.nextLine();
		
		System.out.println("Tercera ciutat");
		cit3 = sc.nextLine();
		
		System.out.println("Quarta ciutat");
		cit4 = sc.nextLine();
		
		System.out.println("Cinquena ciutat");
		cit5 = sc.nextLine();
		
		System.out.println("Sisena ciutat");
		cit6 = sc.nextLine();
		
		System.out.println(cit1 + ", " + cit2 + ", " + cit3 + ", " + cit4 + ", " + cit5 + ", " + cit6);
		
		//Fase 2
		System.out.println("\nFase 2");
		
		String[] arrayCiutats = new String[6];
		
		arrayCiutats[0] = cit1;
		arrayCiutats[1] = cit2;
		arrayCiutats[2] = cit3;
		arrayCiutats[3] = cit4;
		arrayCiutats[4] = cit5;
		arrayCiutats[5] = cit6;
		
		Arrays.sort(arrayCiutats);
		
		for(int i = 0; i < arrayCiutats.length; i++) {
			System.out.println(arrayCiutats[i]);
		}
		
		//Fase 3
		System.out.println("\nFase 3");
		
		String[] arrayCiutatsModificades = new String [6];
		String modificar;
		char[] ciutatChar;
		
		for(int i = 0; i < arrayCiutats.length; i++) {
			ciutatChar = arrayCiutats[i].toCharArray();
			for(int c = 0; c < ciutatChar.length; c++) {
				if(ciutatChar[c] == 'a' || ciutatChar[c] == 'A') {
					ciutatChar[c] = '4';
				}
			}
			
			modificar = new String(ciutatChar);
			arrayCiutatsModificades[i] = modificar;
			

		}
		
		for(String i : arrayCiutatsModificades) {
			System.out.println(i);
		}
		
		//Fase 4
		System.out.println("\nFase 4");
		
		char[] ciu1 = new char[arrayCiutats[0].length()];
		char[] ciu2 = new char[arrayCiutats[1].length()];
		char[] ciu3 = new char[arrayCiutats[2].length()];
		char[] ciu4 = new char[arrayCiutats[3].length()];
		char[] ciu5 = new char[arrayCiutats[4].length()];
		char[] ciu6 = new char[arrayCiutats[5].length()];
		
		ciu1 = cit1.toCharArray();
		ciu2 = cit2.toCharArray();
		ciu3 = cit3.toCharArray();
		ciu4 = cit4.toCharArray();
		ciu5 = cit5.toCharArray();
		ciu6 = cit6.toCharArray();
		
		//Ciutat 1
		for(char i : ciu1) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu1.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu1[i]);
			} else {
				System.out.print(ciu1[i]);
			}
		}
		
		//Ciutat 2
		for(char i : ciu2) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu2.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu2[i]);
			} else {
				System.out.print(ciu2[i]);
			}
		}
		
		//Ciutat 3
		for(char i : ciu3) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu3.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu3[i]);
			} else {
				System.out.print(ciu3[i]);
			}
		}
		
		//Ciutat 4
		for(char i : ciu4) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu4.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu4[i]);
			} else {
				System.out.print(ciu4[i]);
			}
		}
		
		//Ciutat 5
		for(char i : ciu5) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu5.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu5[i]);
			} else {
				System.out.print(ciu5[i]);
			}
		}
		
		//Ciutat 6
		for(char i : ciu6) {
			System.out.print(i);
		}
		System.out.print(" - ");
		for(int i = ciu6.length -1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(ciu6[i]);
			} else {
				System.out.print(ciu6[i]);
			}
		}
		
		sc.close();
	}
}
