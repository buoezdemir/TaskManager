import java.util.Scanner;

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
		while (!s.equals("3")) {
			MenüAnzeigen();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.ausgabe();
				break;
			case "2":
				this.durchsuchen();
				break;
			case "3":
				this.zeigeDeadline();
				break;
			case "4":
				this.hinzufügen();
				break;
			case "5":
				this.erledigt();
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


}
