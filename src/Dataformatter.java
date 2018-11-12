

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Dateformatter {
	private final static String dateformat = "dd.MM.yyyy"; 

	/**
	 * Gibt einen Formartierten Datumsstring zurück auf der Basis des übergebenen GregorianCalendar
	 * @param GregorianCalendar datum 
	 * @return String datum 
	 */	
	public static String calendarToString(GregorianCalendar datum) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateformat);
	    String calendarString = simpleDateFormat.format(datum.getTime());
	    return calendarString;

	}

	/**
	 * Gibt einen GregorianCalendar zurück auf der Basis des übergebenen String
	 * @param stringDate
	 * @return GregorianCalendar
	 */
	public static GregorianCalendar stringToCalendar(String stringDate) {
		 if (stringDate == null) {
		      return null;
		    }
		 
		 	GregorianCalendar calendar = new GregorianCalendar();
		    try {
		      Timestamp newDate = Timestamp.valueOf(stringDate);
		      calendar.setTime(newDate);
		    }
		    catch (Exception e) {
		      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateformat);
		      try {
		        calendar.setTime(simpleDateFormat.parse(stringDate));
		      }
		      catch (ParseException pe) {
		        calendar = null;
		      }
		    }
		 
		    return calendar;
	}

}
