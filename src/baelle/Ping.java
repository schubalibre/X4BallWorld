package baelle;

import ballworld.World;

public class Ping extends Basic {
	
	public boolean nachRechts = true;
	public boolean nachOben = true;
	public double kmhX; // unsere Zufallsgeschwindigkeit 
	public double kmhY; // unsere Zufallsgeschwindigkeit 
	
	public Ping(final World world){
		radius = 10;	
		kmhX = this.randomGeschwindigkeit();
		kmhY = this.randomGeschwindigkeit();
		x = (Math.random()-0.5) * (world.getMaxX()*2) - radius;
		y = (Math.random()-0.5) * (world.getMaxY()*2) - radius;
	}

	public void act(){
		/* 
		 * Wenn der Ball den äußeren Rand erreicht wollen wir,
		 * dass er wieder zurück läuft und umgedreht!
		 * Wir addieren bzw subtrahieren den Radius damit er 
		 * genau am Rand abprallt und ihn nicht überlappt
		 * Und hier ist wieder unser Schlater der immer dann 
		 * Umspringt, wenn er in einem der Extremen ist!
		 * 
		 * */ 
		if(x+radius >= world.getMaxX()){
			nachRechts = false;
			// bei jedem "Anstoß" verändern wir die Geschwindigkeit
			kmhX = this.randomGeschwindigkeit();
		}else if(x-radius <= world.getMinX()){
			nachRechts = true ;
			kmhX = this.randomGeschwindigkeit();
		}

		if(nachRechts){
			x += kmhX;
		}else{
			x -= kmhX;
		}
		
		if(y+radius >= world.getMaxY()){
			nachOben = false;
			// bei jedem "Anstoß" verändern wir die Geschwindigkeit
			kmhY = this.randomGeschwindigkeit();
		}else if(y-radius <= world.getMinY()){
			nachOben = true ;
			kmhY = this.randomGeschwindigkeit();
		}

		if(nachOben){
			y += kmhY;
		}else{
			y -= kmhY;
		}	
	}
	
	public double randomGeschwindigkeit(){
		return (Math.random() + 0.1) * 10;
	}
}
