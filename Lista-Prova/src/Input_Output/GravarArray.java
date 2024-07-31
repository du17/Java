package Input_Output;
import java.io.*;

public class GravarArray {

    public static void gravarArray(String[] array, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String s : array) {
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        String[] array = {"Linha 1", "Linha 2", "Linha 3"};
        gravarArray(array, "array_example.txt");
    }*/
}
