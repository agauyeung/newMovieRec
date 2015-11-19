import java.util.Calendar;
import java.util.Date;
import java.util.Timer;


public class Time {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
           Timer timer = new Timer();
           //Date clock = new Date();
           Calendar everyday = Calendar.getInstance();
           everyday.set(Calendar.HOUR_OF_DAY, 2);
           everyday.set(Calendar.MINUTE, 0);
           timer.schedule(new Retask(), everyday.getTime(), 60*60*24*7*100);   
       }

}