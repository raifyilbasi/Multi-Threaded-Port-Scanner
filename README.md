# Multi-Threaded-Port-Scanner
Ein effizienter, nebenläufiger Port-Scanner in Java, der mithilfe von Thread-Pools TCP-Ports auf Erreichbarkeit prüft.

## Funktionsweise
Das Programm scannt einen definierten Bereich von Ports für eine angegebene IP-Adresse. Um die Geschwindigkeit zu optimieren, werden die Anfragen nicht nacheinander, sondern parallel verarbeitet.

* **Parallelisierung:** Nutzt einen `ExecutorService` mit einem festen Thread-Pool zur Aufgabenverteilung.
* **TCP-Connect:** Versucht eine Socket-Verbindung aufzubauen, um den Status des Ports zu ermitteln.
* **Asynchrone Verarbeitung:** Ergebnisse werden über `Future`-Objekte gesammelt, ohne den Haupt-Thread zu blockieren.

### Voraussetzungen
* Java Development Kit (JDK) 8 oder höher.
