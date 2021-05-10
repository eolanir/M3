package m3;

import java.util.Scanner;

public class Nivell3 {
	
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //demanem el nombre al usuari 
        System.out.println("Introdueix un nombre per mostrar la successió de Fibonacci.");
        int num = sc.nextInt();
        //comprovem que el nombre sigui major de 0
        while(num < 1){
            System.out.println("Introdueix un nombre major que 0.");
            num = sc.nextInt();
        }
        sc.close();

        //inicialitzem l'array amb el nombre que ens han donat
        int[] fib = new int[num];
        
        //asignem valors als primers espais perque tingui valors que sumar afegint valors nomes en cas de que la longitud ho permeti
        fib[0] = 0;
        if(fib.length > 1){
            fib[1] = 1;
        } else if (fib.length > 2){
            fib[2] = 1;
        }

        //loop per asignar valors a l'array
        for (int i=2; i<num; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }
        //loop per imprimir els numeros a pantalla i un condicional per treure la coma final
        for (int i=0; i<num; i++){
            if (i == num-1){
                System.out.print(fib[i]);
            } else {
                System.out.print(fib[i] + ",");
            }
        
        }
    }
}
