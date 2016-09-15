package com.svenkayser.romyio;

public class Example {
	public static RomyIO romyIO;
	public static void main(String[] argv){
		RomyIO.run("test", new Runnable(){
			public void run(){
				/* insert code here */
				
				RomyIO.write("Die Antwort auf alle Fragen ist: ");
				RomyIO.write(3*7*2);
				RomyIO.newLine();
				
				String antwort = RomyIO.read("Was ist die Frage auf alle Antworten?");

				if(antwort.equals("Hä?")){
					RomyIO.write("Richtig");
				} else {
					RomyIO.write("Hä?");
				}
				
				RomyIO.newLine();
				
				if(RomyIO.ask("Zum Abschluss die Frage: Warum?")){
					RomyIO.write("Dachte ich mir.");
				} else {
					RomyIO.write("Warum nicht?");
				}
				
				/* end of code here */
			}
		});
	}
}
