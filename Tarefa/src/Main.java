//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1

        List<Integer> listinha = new ArrayList<Integer>();

        listinha.add(4);
        listinha.add(10);
        listinha.add(99);
        listinha.add(3);
        listinha.add(23);

        System.out.println(listinha);

        //2

        List<String> compra = new ArrayList<>();

        compra.add("\nchocolate");
        compra.add("\nred label");
        compra.add("\ncanetas");

        for (String itens : compra){
            System.out.println(itens);
        }

        compra.remove(0);

        for (String itens : compra){
            System.out.println("\n" + itens);
        }
    }
}