#0001-Die-zwei-Objekte

##Übersicht

Implementiert ein Beispiel analog zur Aufgabe "Objektkommunikation: Paul und sein Motorroller"

In diesem Beispiel werden wir das Verhältnis von einem Besitzer zu seinem Mobiltelefon beschreiben. Da wir uns in einer Zeit befinden als SMS noch Geld kosteten (Deutschland, frühes 21. Jahrhundert, späte Schrödersche Epoche), nehmen wir an, dass jede SMS 3 Cent kostet. Zur Vereinfachung gehen wir davon aus, dass es sich um Prepaid-Handies handelt, und somit nur die Kosten für SMS vom ~~Hartz 4~~ Gehalt gezahlt werden müssen.

Beachtet werden muss, dass jedes Handy nur einen Begrenzten Nachrichtenspeicher hat, und geleert werden muss sollte er voll sein und weitere SMS versendet werden.

Implementiert werden die zwei Klassen **Handy** und **Besitzer**, jeder Besitzer hat sein eigenes Handy und kann dies aufladen und damit SMS versenden, allerdings kann auch jeder Besitzer das Handy von jemand anderem aufladen (nett!) oder damit SMS versenden (WTF?).

##Übung für Schlauponies:

Implementiere basierend auf den vorhandenen Klassen die Methoden
* smsSenden, für jeden Besitzer, womit ein Besitzer mit dem eigenen Handy eine Nachricht (String) an ein anderes Handy senden kann.
* smsLesen, für jeden Besitzer, womit ein Besitzer von seinem eigenen Handy darauf aufmerksam gemacht wird eine Nachricht empfangen zu haben
* smsVesenden, für jedes Handy, womit ein Handy eine SMS an ein anderes Handy schickt
* smsEmpfangen, für jedes Handy, womit ein Handy eine SMS empfängt, und seinen Besitzer darauf aufmerksam macht
