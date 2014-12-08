package baelle;

public class Kick extends Basic {

	public Kick(){
		// Wir kreieren unseren Ball
		radius = 10;
	}

	@Override
	public void userClicked(double arg0, double arg1) {
		// hier bekommen wir unsere x und y Koordinaten des Mouse-Klicks und übergeben sie unserem Ball. 
		x = arg0;
		y = arg1;
	}

	@Override
	public void userTyped(char arg0) {
		// Wir holen uns die Eingabe des Nutzers in Form eines char (Buchstaben)
		char key = arg0;
		
		// Kontrolle ob der Nutzer den Buchstaben d drückt
		if(key == 'd'){
			//hier könnte man auch den nächsten Ball auswählen und dann ihn löschen
			// Kontrolle ob ein Ball aktiviert ist (this == null -> also kein Ball da)
			if(this != null){
				// Wir benutzen unsere world Klasse um unseren rot markierten Ball zu löschen 
				world.removeBall(this); 
			}
		}
	}
	
}

//fertig
