package home.jcg.testapp;

import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new App();
    }
    

	public App()
    {
        System.out.println( "Hello World!" + getNextDate( new Date()).getTime());
    }
    
    
    private Calendar getNextDate(Date date)
    {
    	Date nextDate = addDays(date, 1);
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(nextDate);
    	
    	return calendar;
    }
    
    
    public static Date addDays(Date baseDate, int daysToAdd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(baseDate);
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
        return calendar.getTime();
    }
    
    
}
