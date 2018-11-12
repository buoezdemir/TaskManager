package aufgabenliste;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import Aufgabe;
import AufgabenMitDeadline;


public class Aufgabenliste {
	private ArrayList<Aufgabe> tasklist;

	public Aufgabenliste() {
		this.tasklist =  new ArrayList<>();
	}
	
	/**
	 * Gibt alle Aufgaben aus der tasklist (ArrayList) aus
	 */
	public void alleAufgabenAnzeigen() {
		for(Aufgabe a: tasklist) {
			System.out.println(getIndex(a) + " " +a );
		}
	}
	
	/**
	 * Sucht nach Aufgaben die den übergebenen String enthalten und gibt sie dann aus. Berücksichtigt aber keine Groß-Kleinschreibung
	 * @param aufgabenText
	 */
	public void aufgabenAnzeigenNachText(String aufgabenText) {
		for(Aufgabe a: tasklist) {
			if(a.getAufgabentext().toLowerCase().trim().contains(aufgabenText.toLowerCase().trim())) {
			System.out.println(getIndex(a) + " " +a);
			}
		}
	}
	
	/**
	 * Gibt alle Aufgaben mit einer Deadline aus und hebt die die heute oder schon früher fällig sind vor
	 */
	public void deadlinesAusgeben() {
		for(Aufgabe a: tasklist) {
			if(a instanceof AufgabenMitDeadline) {
				AufgabenMitDeadline a1 = (AufgabenMitDeadline) a;
				
				if(new GregorianCalendar().before(a1.getDeadline())) {
					System.out.println(getIndex(a) + " " + a);
				}
				else {
					Aufgabe task = a1;
					task.setAufgabentext(a.getAufgabentext().toUpperCase());
					System.out.println(getIndex(a) + " Wichtig: " + task);
				}
			}
		}
	}
	
	/**
	 * Fügt die übergebene Aufgabe der tasklist (ArrayList) hinzu
	 * @param task
	 */
	public void addAufgabe(Aufgabe task) {
		tasklist.add(task);
	}

	/**
	 * Löscht eine Aufgabe mit dem übergebenen Index aus der ArrayList
	 * @param index
	 */
	public void aufgabeErledigt(int index) {
		tasklist.remove(index);
		System.out.println("Eintrag entfernt");
	}
	
	/**
	 * Gibt die Größe der tasklist (ArrayList) zurück
	 * @return größe der tasklist (ArrayList)
	 */
	public int getArrayListSize() {
		return tasklist.size();
	}
	
	/**
	 * Gibt einen String mit dem Index der tasklist (ArrayList) des übergbenen Objektes zurück
	 * @param a
	 * @return
	 */
	private String getIndex(Aufgabe a) {
		return "ID= " + tasklist.indexOf(a) + " ";
	}
}
