package JavaHomeworkAdditional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAntTime {
    public void check(){

        /*Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:EEEE:D:G");
        System.out.println(simpleDateFormat.format(date));*/
        Calendar calendar = new GregorianCalendar();
        Date dateE = calendar.getTime();
        System.out.println(dateE);
    }
}
