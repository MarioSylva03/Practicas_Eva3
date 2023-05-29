/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author mario
 */
public class Eva3_8_Custom_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona perso1 = new persona();
        perso1.setName("John");
        perso1.setApellido("Fortnite");
        try{
        perso1.setEdad(-5);
        }catch (DatoIncorrectoCheckException e){
            System.out.println(e.getMessage());
        }        
        
    }
    
}

class persona{
    private String name;
    private String apellido;
    private int edad;

    public persona() {
        this.name = "";
        this.apellido = "";
        this.edad = 0;
    }

    public persona(String name, String apellido, int edad) throws DatoIncorrectoCheckException {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        setEdad(edad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckException {
        if(edad < 0)
            
            //throw new DatoIncorrectoException(); //UNCHECKED EXCEPTION
            
            throw new DatoIncorrectoCheckException();
        this.edad = edad;
            
    }
    
    
    
}



class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato incorrecto!! El valor no puede ser negativo");
    }
    
}

class DatoIncorrectoCheckException extends Exception {

    public DatoIncorrectoCheckException() {
         super("Dato incorrecto!! El valor no puede ser negativo");
    }
    
    
    
}
