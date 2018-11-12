import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import Aufgabe;
import AufgabenMitDeadline;
import Aufgabenliste;

public class Kommandozeile {

	Scanner scan;

	public Kommandozeile() {
		this.scan = new Scanner(System.in);
	}

	public void MenüAnzeigen() {
		System.out.println("********Liste XXX bearbeiten*******");
		System.out.println("1) Alle Aufgaben anzeigen");
		System.out.println("2) Aufgaben durchsuchen");
		System.out.println("3) Deadlines anzeigen");
		System.out.println("4) Neue Aufgabe hinzufügen");
		System.out.println("5) Aufgabe erledigt");
		System.out.println("x) Beenden");
		System.out.println("********************************** ");
	}

	public void start() {		
		String s = "-";
		while (!s.equals("6")) {
			MenüAnzeigen();
			s = scan.nextLine(); 
			switch (s) 
			{
			case "1":
				this.tasklisteAusgeben();
				break;
			case "2":
				this.inTasklisteSuchen();
				break;
			case "3":
				this.deadlineAnzeigen();
				break;
			case "4":
				this.aufgabeHinzufuegen();
				break;
			case "5":
				this.aufgabeEntfernen();
				break;
			case "x":
				this.beende();
				break;
			default:
				this.fehler();
				break;
			}
		}
		scan.close();
	}
	
	private void beende() {
		System.exit(0);
		
	}

	private void erledigt() {
		// TODO Auto-generated method stub
		
	}

	private void zeigeDeadline() {
		// TODO Auto-generated method stub
		
	}

	private void hinzufügen() {
		// TODO Auto-generated method stub
		
	}

	public void ausgabe()
	{
		System.out.println("Alle Aufgaben werden aufgelistet:");
	}
	
	public void durchsuchen()
	{
		System.out.println("Aufgaben werden durchsucht...");
	}
	
	public void fehler()
	{
		System.out.println("Sie können nur 1,2,3,4,5 oder x eingeben!");
	}


	/**
	 * Ruft die Methode alleAufgabenAnzeigen() der Aufgabenliste auf die dann alle gespiecherten Aufgaben ausgibt
	 */
	private void tasklisteAusgeben() {
		tasklist.alleAufgabenAnzeigen();
	}
	
	/**
	 * Fordert nach einen Aufgabentext auf und übergibt das dann der Methode aufgabenAnzeigenNachText() der Aufgabenliste
	 */
	private void inTasklisteSuchen() {
		System.out.println("Bitte geben Sie den Aufgabentext ein");
		String text = scan.nextLine();
		tasklist.aufgabenAnzeigenNachText(text);
	}
	
	/**
	 * Ruft die Methode deadlinesAusgeben() der Aufgabeliste auf die alle AufgabenMitDeadline anzeigt
	 */
	private void deadlineAnzeigen() {
		tasklist.deadlinesAusgeben();
	}

	/**
	 * Fragt welche Aufgaben man hinzufügen möchte und ruft die dafür nötigen Methoden auf
	 */
	private void aufgabeHinzufuegen() {
		System.out.println("Welche Aufgabe möchten Sie hinzufügen");
		System.out.println(gueltiugeAufgaben()); // Zeigt alle verfügbaren Aufgaben an
		String eingabe = scan.nextLine();
		if (eingabe.toLowerCase().trim().equals(AufgabenEnum.AUFGABE.toString().toLowerCase())) {
			tasklist.addAufgabe(newAufgabe());
		}
		if (eingabe.toLowerCase().trim().equals(AufgabenEnum.AUFGABEMITDEADLINE.toString().toLowerCase())) {
			tasklist.addAufgabe(newAufgabeMitDeadline());
		}
	}

	/**
	 * Gibt alle gültigen Aufgaben aus der Klasse AugabenEnum als String zurück

}
