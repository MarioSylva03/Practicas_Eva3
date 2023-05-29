/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_append_text;

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
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Eva3_12_APPEND_TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
String ruta = "C:\\Escritura\\";
try {
            writeUsingBufferedWriter(ruta, "append");
        } catch (IOException ex) {
            Logger.getLogger(Eva3_12_APPEND_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
             File file = new File (ruta + "archivoBufferedWriter.txt");
             FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufwriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < 10; i++) {
                bufwriter.write((i + 1) + " " + datos);
                bufwriter.write("\n");
                }
            bufwriter.close();
        }
    
    
}
