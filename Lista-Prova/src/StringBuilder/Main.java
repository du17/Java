package StringBuilder;

public class Main {
    public static void main(String[] args) {

        StringBuilderArray array = new StringBuilderArray();
        RemoverVogais rv = new RemoverVogais();
        InsertString I = new InsertString();

        String[] palavras = {"Hello", "World", "Java"};
        String vogal = "Hello, World!";
        String original = "Hello World!";
        String inserir = " Java";
        int posicao = 5;

        System.out.println("String apartir de Palavras : \n");
        System.out.println(array.construirString(palavras));

        System.out.println("Remoção de Vogais : \n");
        System.out.println(rv.removeVogais(vogal));

        System.out.println("Insersão de Strings : \n");
        System.out.println(I.inserirString(original, inserir, posicao));
    }
}
