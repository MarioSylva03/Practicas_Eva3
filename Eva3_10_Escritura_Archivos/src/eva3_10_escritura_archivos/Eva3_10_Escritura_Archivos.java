/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_escritura_archivos;

import com.sun.istack.internal.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;

/**
 *
 * @author mario
 */
public class Eva3_10_Escritura_Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "C:\\Escritura\\";
        try {
            writeUsingFiles(ruta, "Prueba de escitura de archivos usando Files");
            writeUsingFileWriter(ruta, "Prueba de escitura de archivos usando FileWriter");
            writeUsingBufferedWriter(ruta, "Prueba de escritura de archivos usando BufferedWriter");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Eva3_10_Escritura_Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        
        Path path = Paths.get(ruta + "EscrituraFiles.txt");
        Files.write(path, datos.getBytes());
    }
    
        public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
            File file = new File (ruta + "EscrituraFileWriter.txt");
            FileWriter  fileWriter = new FileWriter (file);
            fileWriter.write(datos);
            fileWriter.close();
}
        public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
             Path path = Paths.get(ruta + "EscrituraBufferedWriter.txt");
            OutputStream out = Files.newOutputStream(path);
            OutputStreamWriter osWriter = new OutputStreamWriter(out);
            BufferedWriter bufwriter = new BufferedWriter(osWriter);
            for (int i = 0; i < 10; i++) {
                bufwriter.write((i + 1) + " " + datos);
                bufwriter.write("\n");
                }
            bufwriter.close();
            osWriter.close();
            
         
        }
        
}