package DataCalendar;

import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DataDiferentes DD = new DataDiferentes();
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2024, Calendar.JULY, 1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2024, Calendar.JULY, 30);

        System.out.println("Diferença em dias: " + DD.calcularDiferencaEmDias(cal1.getTime(), cal2.getTime()));

        AddDias AD = new AddDias();
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.JULY, 1);

        Date novaData = AD.adicionarDias(cal.getTime(), 10);
        System.out.println("Nova data: " + novaData);

        VerificaData VD = new VerificaData();
        Calendar cal3 = Calendar.getInstance();
        cal3.set(2024, Calendar.JULY, 1);

        Calendar cal4 = Calendar.getInstance();
        cal4.set(2024, Calendar.JULY, 30);

        System.out.println(VD.verificaDatas(cal3.getTime(), cal4.getTime()));
    }
}
