package StringBuilder;

public class StringBuilderArray {

    public static String construirString(String[] palavras) {
        StringBuilder sb = new StringBuilder();
        for (String palavra : palavras) {
            sb.append(palavra).append(" ");
        }
        return sb.toString().trim();
    }
}

