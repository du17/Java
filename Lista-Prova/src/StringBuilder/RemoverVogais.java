package StringBuilder;

public class RemoverVogais {

    public static String removeVogais(String s) {
        StringBuilder sb = new StringBuilder();
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vogais.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

