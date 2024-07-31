package Input_Output;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        LerArquivo ler = new LerArquivo();
        CopiarArquivo copia = new CopiarArquivo();
        GravarArray gravar = new GravarArray();


        //o arquivo de teste esta na pasta, se vc baixou o projeto
        //aconselho mudar o caminho pra que funcione.
        ler.lerArquivo("C://Users//duda9//IdeaProjects//Lista-Prova//src//teste.txt");

        copia.copiarArquivo("C://Users//duda9//IdeaProjects//Lista-Prova//src//teste.txt", "C://Users//duda9//IdeaProjects//Lista-Prova//src//copia.txt");
        ler.lerArquivo("C://Users//duda9//IdeaProjects//Lista-Prova//src//copia.txt");

        String[] array = {"Linha 1", "Linha 2", "Linha 3"};
        gravar.gravarArray(array, "C://Users//duda9//IdeaProjects//Lista-Prova//src//array.txt");
        ler.lerArquivo("C://Users//duda9//IdeaProjects//Lista-Prova//src//array.txt");
    }
}
