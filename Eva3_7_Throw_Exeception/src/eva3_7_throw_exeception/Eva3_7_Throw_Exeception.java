/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_throw_exeception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Eva3_7_Throw_Exeception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor positivo");
            int valor = input.nextInt();
            prueba obj = new prueba ();
            obj.setValor(valor);
        } catch (Exception ex) {  //Es la super clase de todas las excepciones
                                  // por tanto, captura todas la excepciones
                                  //complica detectar el tipo de execpcion y dar la solucion
                                  //correcta
            System.out.println(ex.getMessage());
        }
    }
    
    
}

class prueba{
    private int valor;

        public int getValor() {
            return valor;
        }

        //checked exceptions:
        //unchecked exceptions: errores de logica, del programador
        //                      java no te obliga a resolverlas
        public void setValor(int valor) throws Exception  {
            if(valor < 0 ){
                throw new Exception ("El valor " +valor+ " Es invalido. Debe ser mayor o igual a cero");    }     
            else
            this.valor = valor;
        }
}

        

    
