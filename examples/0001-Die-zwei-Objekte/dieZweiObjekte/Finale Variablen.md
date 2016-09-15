## Finale Variablen

Im Programmverlauf immer gleiche Werte sollten trotzdem in Form einer "Festen" Variable notiert werden. So können sie später,	sollte sich dieser Wert grundsätzlich ändern, durch das ändern einer einzigen Zeile geändert werden, statt mehrere Vorkommen im Quelltext ändern zu müssen.

So wäre z.B. für den deutschen Bundeskanzler
```java
static final String BUNDESKANZLER = "Angela Merkel";
```
aber sollte sich das ändern, könnte man diese eine Zeile korrigieren, z.B. nach
```java
static final String BUNDESKANZLER = "Gregor Gysi";
```
und hätte damit alle Vorkommen von BUNDESKANZLER berücksichtigt.

Diese Art von Variable kann, einmal zugewiesen, im Programmverlauf nicht weiter geändert werden da sie >__final__<, sprich endgültig ist. Im Verwendungszweck wie hier gesehen, als Pseudo-Konstante, ist zudem zu empfehlen sie als "static final" und damit der Klasse zugehörig zu definieren. Dies ist allgemein übliche Konvention und hat den Grund, dass es keinen Sinn macht einen Wert, der innerhalb des Programmes immer gleich ist, mehrfach im Speicher zu halten.
