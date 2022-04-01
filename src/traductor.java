package src;
/**
 * traductor
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class traductor {
    public ArrayList<String> leerFichero(File fichero){
        ArrayList<String> lista = new ArrayList();
        
        FileReader fr = null;
        BufferedReader br;
     
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
     
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace(System.out);
            }
        }
        return lista;
    }
}