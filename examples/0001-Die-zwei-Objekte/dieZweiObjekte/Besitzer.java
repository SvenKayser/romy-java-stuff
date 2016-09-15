package dieZweiObjekte;

import dieZweiObjekte.Handy;

public class Besitzer {
	
	// Attribute
	
	private String name;
	private double geld;
	private Handy meinHandy;
	
	/**
	 * Konstruktor, der die Attribute der Klasse über Parameter initialisiert
	 * @param pName Der Name des Besitzers
	 * @param pGeld Der zweifelhafte Reichtum des Besitzers
	 * @param pMeinHandy Das Handy des Besitzers
	 */
	public Besitzer(String pName, double pGeld, Handy pMeinHandy)
	{
		// Parameter werden in die Attribute der Klasse geschrieben
		name = pName;
		geld = pGeld;
		meinHandy = pMeinHandy;
	}

	/**
	 * Methode, die den Namen des Besitzers liefert
	 * @return Der Name des Besitzers
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Methode, die das derzeitige Geld des Besitzers liefert
	 * @return Der unermessliche Reichtum des Besitzers
	 */
	public double getGeld()
	{
		return geld;
	}
	
	/**
	 * Methode, die das Handy des Besitzers liefert
	 * @return Das Handy des Besitzers
	 */
	public Handy getHandy()
	{
		return meinHandy;
	}
	
	/*
	 * Anm.: Folgende Methoden sind "überladen", heisst, dass mehrere Methoden mit dem selben Namen aber unterschiedlichen Parametern genutzt werden.
	 * Siehe dazu: Überladung.md
	 */
	
	/**
	 * Methode, die das *eigene* Handy aufläd, nutzt die generelle Methode zum Aufladen von Handys mit dem eigenen Handy als Parameter 
	 * @param pAufladung Menge, die aufgeladen werden soll
	 * @return Ob's geklappt hat
	 */
	public boolean aufladen(double pAufladung)
	{
		return aufladen(pAufladung, meinHandy);
	}
	
	/**
	 * Generelle Methode zum Aufladen eines Handys
	 * @param pAufladung Menge, die aufgeladen werden soll
	 * @param pHandy Das Handy, das aufgeladen werden soll
	 * @return Ob's geklappt hat
	 */
	public boolean aufladen(double pAufladung, Handy pHandy)
	{
		if(pAufladung <= geld){
			pHandy.aufladen(pAufladung);
			geld = geld - pAufladung;
			return true;
		} else {
			return false;
		}
	}
	
	/** 
	 * Methode, die eine Anzahl von SMS vom eigenen Handy versendet. Nutzt die generalle Methode zum versenden von SMS von Handys mit dem eigenen
	 * Handy als Parameter
	 * @param pAnzahl Anzahl von SMS
	 * @return Ob's geklappt hat
	 */
	public boolean versenden(int pAnzahl)
	{
		return versenden(pAnzahl, meinHandy);
	}
	
	/** 
	 * Generelle Methode zum Versenden von SMS von einem Handy
	 * @param pAnzahl Anzahl von SMS
	 * @param pHandy Handy, von dem SMS versendet werden soll
	 * @return Ob's geklappt hat
	 */
	public boolean versenden(int pAnzahl, Handy pHandy)
	{
		return pHandy.sende(pAnzahl);
	}
	
}
