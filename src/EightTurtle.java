package assignment2_fatma;

public class EightTurtle extends SmartTurtle {
	
	// overrides the method that inherited  from smart turtle , in probability to create shape by certain size/sides 
	public void draw (int sides, double size){
		
		if (Math.random()<0.5) 
			drawAsEightTurtle(8, size);
		else
			drawAsEightTurtle(sides, 18);
		
	}

	//regular draw method from smart turtle class
	public void drawAsEightTurtle(int sides, double size){
		super.draw(sides, size);
		
	}
	
}
