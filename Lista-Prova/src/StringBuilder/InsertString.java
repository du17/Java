package StringBuilder;

public class InsertString {

    public static String inserirString(String o, String i, int p) {
        StringBuilder sb = new StringBuilder(o);
        sb.insert(p, i);
        return sb.toString();
    }
}