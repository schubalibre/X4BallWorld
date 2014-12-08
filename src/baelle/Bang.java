package baelle;

import ballworld.World;

public class Bang extends Ping {
	
	public Bang(final World world) {
		super(world);
		radius = 2;
	}

	@Override
	public void act() {
		
		super.act();
		
		if(x+radius >= world.getMaxX() 
				|| x-radius <= world.getMinX() 
				|| y+radius >= world.getMaxY() 
				|| y-radius <= world.getMinY()){
			radius += 0.5;
			System.out.println(radius);
		}

		if(radius >= 5.0){
			System.out.println("remove");
			world.removeBall(this); 
		}
	}

}
