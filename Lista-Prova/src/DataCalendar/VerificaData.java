package DataCalendar;

import java.util.Calendar;
import java.util.Date;

public class VerificaData {

    public static String verificaDatas(Date data1, Date data2) {
        if (data1.before(data2)) {
            return "Data1 é antes de Data2";
        } else if (data1.after(data2)) {
            return "Data1 é depois de Data2";
        } else {
            return "Data1 é igual a Data2";
        }
    }
}
