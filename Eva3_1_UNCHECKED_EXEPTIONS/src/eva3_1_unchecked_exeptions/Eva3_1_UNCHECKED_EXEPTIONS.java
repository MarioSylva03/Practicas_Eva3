/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_unchecked_exeptions;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Eva3_1_UNCHECKED_EXEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIANDO PROGRAMA");
        System.out.println("DECLARANDO VARIABLES");
        int x = 5, y =0;
        System.out.println("INTENTAR DIVISION");
        int resu = x / y; //AQUI SE GENERA LA EXEPCION
                          //SI NO ATIENDE, EL PROGRAMA
        System.out.println("Resultado:" +resu);

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int nume = input.nextInt();
        System.out.println("El numero es:" + nume); 
        
        
        
      int[] arreglo = new int [5]; // ARREGLO CON 5 POSICIONES 
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
   
        
        //NULL POINTER EXCEPTION
        prueba objprueba = null; // EL OBJETO PRUEBA NO ESCISTE, ES NULO
        
        System.out.println("Valor de x =" +objprueba.x);  // NO PUEDO LEER LA X PORQUE
                                                          //LA X NO EXISTE
              
        
    }
    
    
    
    
}

class prueba{
    int x = 100;
}