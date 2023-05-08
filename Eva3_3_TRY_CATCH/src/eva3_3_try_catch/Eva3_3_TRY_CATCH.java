/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_try_catch;

/**
 *
 * @author mario
 */
public class Eva3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        
        try{  //SECCION DE CODIGO QUE PTENCIALMENTE GENERA
              //UNA EXCEPCION
        int resu = x / y;
        System.out.println("Resultado = " +resu);
        }catch(ArithmeticException e){//se genera un bojeto exception llamado "e"
                                      //de tipo ArithmeticException
            System.out.println("Se proujo un error: " + e.getMessage());
                                      
        }
        
        System.out.println("Programa terminado");
    }
    
}
