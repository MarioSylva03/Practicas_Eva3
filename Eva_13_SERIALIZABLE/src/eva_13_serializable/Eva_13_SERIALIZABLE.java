/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Eva_13_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Escritura\\ archivosobjetos.Beans";
            Persona perso = new Persona("Joe", "Momma", 37);
            // GUARDAR EL OBJETO EN EL ARCHIVO
            guardarObj(perso, ruta);
            // LEER EL OBJETO DESDE UN ARCHIVO
            Persona resu = leerObj(ruta);
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Apellido: " + resu.getApellido());
            System.out.println("Edad: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(Eva_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Eva_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void guardarObj (Persona perso, String ruta) throws  IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
        ooStream.writeObject(perso);
        ooStream.close();
    }
    
    public static Persona leerObj (String ruta) throws IOException, ClassNotFoundException{
        Persona perso = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);
         perso = (Persona)oiStream.readObject ();
         return perso;
    }
}
class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}

