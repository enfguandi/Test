import java.util.*;

public class App {

	public static void main(String[] args) {

		int hoehe=0;									// H�he wie viele Abschnitte der Tannenbaum erhalten soll
		int breite = 0;									// Abstand zum "Rand"
		int sterne = 1;									// F�r die Menge der aus zu gebenden Sterne
		Scanner myScanner = new Scanner(System.in);
		

		
		System.out.print("Bitte geben Sie die H�he des Tannenbaums an: ");	// Anweisung zur Eingabe
		hoehe = myScanner.nextInt();					// Einlesen der Eingabe
		System.out.println();
		breite = hoehe*2;								// Erstellen des Abstands zum Rand
		

		for(int l = 0; l < hoehe; l++) {				// Schleife f�r die H�he des Tannenbaums
			for (int j = 0; j <= 2; j++) {				// Schleife f�r die einzelnen "Zweige"
				for(int k = breite; k > 0; k--) {		// Schleife f�r die Erstellung des Abstands zum Rand
					System.out.print(" ");				// Schreiben von Leertasten
				}
				for(int i = 0; i < sterne; i++) {		// Schleife f�r das Schreiben der Sterne in jedem "Zweig"
					System.out.print("*");				// Ausgabe der Sterne
				}
				System.out.println();					// Zeilenumbruch f�r den neuen "Zweig"
				breite--;								// Der neue "Zweig" beginnt mit zwei Sternen mehr daher muss der Abstand zum Rand verringert werden
				sterne = sterne+2;						// Erh�hen der Sterne um 2
			}
			sterne = sterne -4;							// Der neue Ast beginnt 4 Sterne kleiner als der letzte "Zweig"
			breite = breite+2;							// Da es weniger Sterne gibt muss der Abstand zum Rand angepasst werden
		}
		sterne = sterne-3;								// F�r den Stamm werden bei den letzten Sternen die Breite des Stamms Abgezogen um die Mitte zu erhalten
		for(int m=0; m<=(sterne); m++) {				// Schleife f�r das Sreiben von Leertasten f�r den Abstand zum Rand
			System.out.print(" ");
		}
		
		System.out.println("###");						// Ausgabe des Stamms
		
		myScanner.close();
		System.exit(1);

	}

}
