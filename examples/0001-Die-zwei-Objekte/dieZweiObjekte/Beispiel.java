package dieZweiObjekte;

import dieZweiObjekte.Besitzer;
import dieZweiObjekte.Handy;

public class Beispiel {

	
	public static void main(String[] argv){
		
		// Erstmal legen wir drei Personen an, und für jede Person ein neues Handy
		
		// Saruman ist scheisse Reich, und hat ein iPhone mit echt viel Nachrichtenspeicher
		Besitzer saruman = new Besitzer("Saruman, der weiße",50000.0d,
				new Handy(400.0d, 500, 1500)
		);
		
		// Frodo lebt von auenländischem Hartz4, und hat nur ein Motorola
		Besitzer frodo = new Besitzer("Frodo Beutlin", 14.0d,
				new Handy(20.0d, 12, 200)
		);
		
		// Gandalf verdient anständig Geld mit Rauchschiffen, ist aber ein Hipster und hat nur ein Nokia 5110
		Besitzer gandalf = new Besitzer("Gandalf, der graue",2000.0d,
				new Handy(100.0d, 40,50)
		);
		
		// Damit können wir nun einige Dinge tun.
		
		saruman.versenden(200); // Saruman versendet Einladungen für sein neues Partyevent "Belagerung der Zwei Türme (mit Gesangseinlage)"
		frodo.versenden(1); // Frodo sagt ab
		gandalf.versenden(3); // Gandalf sagt dreimal zu, weil er sich jedes mal nicht erinnern kann, ob er schon zugesagt hat.
		frodo.versenden(1, gandalf.getHandy()); // Frodo sagt nochmal mit Gandalfs Handy zu, nur damit er sicher ist.
		saruman.aufladen(10000.0d); // Saruman läd 10 000 € auf sein Handy weil er noch ein paar Orks einladen will
		saruman.getHandy().speicherLöschen(); // Vorher löscht er aber nochmal seinen Speicher
		if(!frodo.aufladen(20.0d)) // Frodo läd 20 € auf sein Handy. Wenn das aber nicht klappt (weil er mal wieder pleite ist) ....
		{ 
			gandalf.aufladen(200.0d, frodo.getHandy()); // .... Muss das wohl mal wieder Gandalf machen.
		}
		
	}
}
