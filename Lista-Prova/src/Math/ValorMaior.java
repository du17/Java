package Math;

public class ValorMaior {
    public static int encontrarValorMaior(int[] array) {
        int maior = array[0];
        for (int i : array) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }
}