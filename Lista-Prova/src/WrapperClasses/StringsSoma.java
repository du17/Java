package WrapperClasses;

public class StringsSoma {
    public static int somarNumeros(String numeros) {
        String[] partes = numeros.split(",");
        int soma = 0;
        for (String parte : partes) {
            soma += Integer.parseInt(parte.trim());
        }
        return soma;
    }
}
