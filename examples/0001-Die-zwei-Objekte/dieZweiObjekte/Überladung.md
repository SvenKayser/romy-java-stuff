##Überladung (von Methoden)

Eine Klasse kann mehrere Methoden des selben Namens enthalten, sofern sich die Art der Parameter unterscheiden. Eine jede solcher Methoden kann ganz unterschiedliche Befehle (-> Code) enthalten. Ein Beispiel:

Eine Klasse hat die Methode "wählen". Als Parameter wird die zu wählende Partei erwartet
```java
public void waehlen(String pPartei)
{
	wahlzettel.ankreuzen(pPartei);
}
```

Wird jedoch die Methode jedoch ohne einen Parameter verwendet, wird eine vorher festgelegte Partei gewählt
```java
public void waehlen()
{
	waehlen("Die Violetten");
}
```

Beachte, wie in diesem Beispiel die Methode ohne Parameter die gleiche Methode mit Parameter aufruft, mit einem bereits vordefinierten Wert. Dies ist von mehreren Möglichkeiten um Methoden mit Standardwerten zur Verwendung zur Verfügung zu stellen, ohne den gleichen Code mehrfach notieren zu müssen.
