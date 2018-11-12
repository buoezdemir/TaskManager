import java.util.GregorianCalendar;

import Dateformatter;

public class AufgabenMitDeadline extends Aufgabe {
	private GregorianCalendar deadline;

	public AufgabenMitDeadline(String aufgabentext, GregorianCalendar deadline) {
		super(aufgabentext);
		this.deadline = deadline;
	}

	public GregorianCalendar getDeadline() {
		return deadline;
	}

	public void setDeadline(GregorianCalendar deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return super.toString() + " Deadline= " + Dateformatter.calendarToString(deadline);
	}

}
