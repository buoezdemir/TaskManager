import java.util.GregorianCalendar;

import Dateformatter;

public class Aufgabe {
	private String aufgabentext;
	private GregorianCalendar datumErstellung;
	
	public Aufgabe(String aufgabentext) {
		this.aufgabentext = aufgabentext;
		this.datumErstellung = new GregorianCalendar();
	}

	public String getAufgabentext() {
		return aufgabentext;
	}

	public void setAufgabentext(String aufgabentext) {
		this.aufgabentext = aufgabentext;
	}

	public GregorianCalendar getDatumErstellung() {
		return datumErstellung;
	}

	@Override
	public String toString() {
		return "Aufgabe= " + aufgabentext + "; Erstellungsdatum= " + Dateformatter.calendarToString(datumErstellung);
	}
	
	


}
