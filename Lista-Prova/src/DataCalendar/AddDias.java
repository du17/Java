package DataCalendar;

import java.util.Calendar;
import java.util.Date;

public class AddDias {

    public static Date adicionarDias(Date data, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return cal.getTime();
    }
}
