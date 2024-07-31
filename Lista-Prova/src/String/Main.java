package String;


public class Main {
    public static void main(String[] args) {
        Palidromo p = new Palidromo();
        Vogais v = new Vogais();
        Ocorrencia o = new Ocorrencia();

        String t1 = "mirim";
        String t2 = "hello";
        String vogal = "Hello, World!";
        String o1 = "Salario";

        System.out.println("Palindromo exemplos : \n");
        System.out.println("\"" + t1 + "\" é um palíndromo? " + p.ehPalindromo(t1));
        System.out.println("\"" + t2 + "\" é um palíndromo? " + p.ehPalindromo(t2));

        System.out.println("Contas de letras exemplos : \n");
        System.out.println("Número de vogais em \"" + vogal + "\": " + v.contarVogais(vogal));

        System.out.println("Exemplos de condições com letras : \n");

        char c = 'l';
        int posicao = o.Ocorrencia(o1, c);

        if (posicao != -1) {
            System.out.println("A primeira ocorrência de '" + c + "' em \"" + o1 + "\" é na posição " + posicao);
        } else {
            System.out.println("O caractere '" + c + "' não foi encontrado em \"" + o1 + "\"");
        }
    }
}
