/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Eva3_9_Read_Text_Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "c:\\Archivos\\prueba.txt";
        try{
        readUsingFiles(ruta);
        readUsingBufferedReader(ruta);
        readUsingFileReader(ruta);
        readUsingScanner(ruta);
                }catch (IOException ex){
                    ex.printStackTrace();
                }
        
    }
    public static void readUsingFiles(String ruta) throws IOException{
        //RECIBIMOS LA RUTA EN FORMATO DE TEXTO
        // LA CONVERTIMOS A FORMATO PATH
        
        Path path = Paths.get(ruta);
        
       //List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
byte [] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));        
    }
    
    /*
    
    */
         public static  void readUsingBufferedReader(String ruta) throws IOException{
             System.out.println("");
             System.out.println("LECTURA DE ARCHIVOS USANDO BUFFERED READER");
                 File file = new File(ruta);
                 FileInputStream is = new FileInputStream(file);
                 InputStreamReader isReader = new InputStreamReader(is);
                 BufferedReader breader = new BufferedReader (isReader);
                 
                 
                 String linea;
                 while((linea = breader.readLine()) != null)
                 {
                 System.out.println(linea);
                         }
                      breader.close();   
   }
            public static void readUsingFileReader(String ruta) throws IOException{
                System.out.println("");
                System.out.println("LECTURA DE ARCHIVOS UJSANDO FILE READER");
                File file = new File(ruta);
                FileReader fileReader = new FileReader(file);
                BufferedReader breader = new BufferedReader (fileReader);
                String linea;
                 
                 while ((linea = breader.readLine()) != null)
                 {
                 System.out.println(linea);
                         }
                 breader.close();   
                 fileReader.close();

            }
            public static void readUsingScanner (String ruta) throws IOException{
                System.out.println("");
                System.out.println("LECTURA DE ARCHIVOS UJSANDO SCANNER");
                Path source = Paths.get(ruta);
                Scanner scanner = new Scanner(source);
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
                            scanner.close();

            }
}
