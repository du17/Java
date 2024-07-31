package DataCalendar;

import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DataDiferentes {

    public static long calcularDiferencaEmDias(Date data1, Date data2) {
        long diferencaMillis = Math.abs(data1.getTime() - data2.getTime());
        return TimeUnit.DAYS.convert(diferencaMillis, TimeUnit.MILLISECONDS);
    }
}
