package Math;

public class Main {
    public static void main(String[] args) {
        Hipotenusa H = new Hipotenusa();
        NumeroAleatorio na = new NumeroAleatorio();
        ValorMaior vm = new ValorMaior();

        double cateto1, cateto2;
        int[] array = {1, 32, 45, 200, 59};

        cateto2 = 4;
        cateto1 = 3;

        System.out.println("Hipotenusa: " + H.calcularHipotenusa(cateto1,cateto2));

        System.out.println("Número aleatório: " + na.gerarNumeroAleatorio());

        System.out.println("Maior valor: " + vm.encontrarValorMaior(array));
    }
}
