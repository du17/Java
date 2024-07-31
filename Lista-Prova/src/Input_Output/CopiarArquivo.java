package Input_Output;
import java.io.*;

public class CopiarArquivo {

    public static void copiarArquivo(String origem, String destino) {
        try (BufferedReader reader = new BufferedReader(new FileReader(origem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destino))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
