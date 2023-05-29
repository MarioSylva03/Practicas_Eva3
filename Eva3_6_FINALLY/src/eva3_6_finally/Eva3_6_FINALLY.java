/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_finally;

/**
 *
 * @author mario
 */
public class Eva3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        try{
            int resu = x / y;
           
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            
        }finally{
            System.out.println("SIEMPRE ME EJECUTO");
        }
        System.out.println("Programa Finalizado");
    }
    
}
