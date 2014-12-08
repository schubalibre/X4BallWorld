package baelle;

import ballworld.World;

public class Feuerwerk extends Bang {
	
	public Feuerwerk(final World world) {
		super(world);
	}
	
	public Feuerwerk(final World world, double startX, double startY){
		this(world);
		x = startX;
		y = startY;	
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		super.act();
		
		if(radius >= 5.0){
			
			System.out.println("new Ball");
			
			Feuerwerk newBall1 = new Feuerwerk(world,x,y);
			
			world.addBall(newBall1);
			
			Feuerwerk newBall2 = new Feuerwerk(world,x,y);
			
			world.addBall(newBall2);
			
			
			System.out.println("remove");
			world.removeBall(this); 
		}
	}
	
	

}
