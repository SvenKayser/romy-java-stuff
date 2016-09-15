package dieZweiObjekte;
public class Handy {
	// Statischer Festwert für die Kosten einer SMS == 3 Cent (0,03 €)
	
	public static final double SMSKOSTEN = 0.03d; // siehe "Finale Variablen.md"

	
	// Attribute
	
	// Privates Attribut, dass das Guthaben speichert; Fließkommazahl == double
	private double guthaben;
	
	// Privates Attribut, dass die Anzahl der gesendeten SMS speichert; Ganzzahl == int
	private int versendeteSms;

	// Privates Attribut, dass die Anzahl der maximal speicherbaren SMS speichert; Ganzzahl == int
	private int speicher;
	
	/**
	 * Der Konstruktor initialisiert das Objekt per Parameterübergabe, d.h. stellt den Ausgangszustand her
	 * @param pGuthaben Der Standardwert des Guthabens auf dem Handy
	 * @param pVersendet Der Standardwert der bereits versandten SMS
	 * @param pSpeicher Der verfügbare Handyspeicher
	 */
	public Handy(double pGuthaben, int pVersendet, int pSpeicher)
	{
		// Parameter werden in die Attribute der Klasse geschrieben
		guthaben = pGuthaben;
		versendeteSms = pVersendet;
		speicher = pSpeicher;
	}
	
	/**
	 * Methode, die eine bestimmte Anzahl von SMS versendet 
	 * @param pAnzahl Anzahl der zu versendenden SMS
	 * @return Ob die SMS versandt werden können.
	 */
	public boolean sende(int pAnzahl)
	{
		/* WENN
		 * - die Anzahl der zu versendenen SMS + die der bereits gespeicherten SMS kleiner oder gleich des Speichers sind
		 * UND
		 * - habeGuthabenFuer == TRUE
		 * DANN
		 * - addiere SMS zu speicher
		 * - subtrahiere SMS-Kosten von Guthaben
		 * - gebe WAHR (TRUE) zurück für "Erfolg"
		 * SONST
		 * - gebe FALSCH (FALSE) zurück für "Kannichnich:("
		 */
		if(pAnzahl + versendeteSms <= speicher && habeGuthabenFuer(pAnzahl))
		{
			versendeteSms = versendeteSms + pAnzahl;
				// Hier geht auch: versendeteSms += pAnzahl. Heisst soviel wie "versendete Sms und addiere dazu pAnzahl"
			
			guthaben = guthaben - pAnzahl*SMSKOSTEN;
				// Hier geht auch: guthaben -= pAnzahl*SMSKOSTEN. Heisst soviel wie "guthaben und subtrahiere davon pAnzahl*SMSKOSTEN"
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Methode, die prüft ob für eine Anzahl X genug Guthaben verfügbar ist
	 * @param pAnzahl Anzahl der SMS für die Geprüft werden soll ob genug Guthaben vorhanden ist
	 * @return Ob genug Guthaben vorhanden ist
	 */
	private boolean habeGuthabenFuer(int pAnzahl){
		if(guthaben >= pAnzahl*SMSKOSTEN){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Methode, die neues Guthaben auf das Handy läd
	 * @param pGuthaben
	 */
	public void aufladen(double pGuthaben){
		guthaben = guthaben + pGuthaben;
	}
	
	/**
	 * Methode, die das derzeitige Guthaben zurückgibt
	 * @return Das Guthaben
	 */
	public double getGuthaben(){
		return guthaben;
	}
	
	/**
	 * Methode, die den Handyspeicher löscht und wieder auf 0 setzt
	 */
	public void speicherLöschen(){
		speicher = 0;
	}
}
