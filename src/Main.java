import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivoOrigen = "origen.txt";
        String archivoDestino = "destino.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))){

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // mantiene los saltos de línea
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
