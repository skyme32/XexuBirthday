import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
	
	static String pathFile = "ascii_art.txt";
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException, InterruptedException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
        	printString(cadena);
        }
        b.close();
    }
        
    public static void printString(String s) throws InterruptedException {
    	System.out.println(s);
        Thread.sleep(100);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length > 0) {
        	pathFile = args[0];
        }
        muestraContenido(pathFile);
    }
   
}
