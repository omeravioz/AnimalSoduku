package assignment2_fatma;

public class JumpyTurtle extends SmartTurtle {
	public static boolean isTailDown=true;

	public void tailDown () { 
		isTailDown=true; 
		super.tailDown();
	}

	public void tailUp () { 
		isTailDown=false; 
		super.tailUp();
	}

	/**
	 * overriding method for moveforward. this method creates the walk of turtle  by Sections of 5 units (by definiation, if his tail down)
	 */
	public void moveForward (double distance ){
		if(isTailDown==false)
			moveAsSmartTurtle(distance);
		else{
			double counter = 0;
			while(counter<distance){
				tailDown();
				moveAsSmartTurtle(5);
				counter=counter+5;
				if( counter<distance){
					tailUp();
					moveAsSmartTurtle(5);
					counter=counter+5;
				}
			}
		}
		tailDown();
	}

//Inheritance of moveforward method from smart turtle class
	public void moveAsSmartTurtle(double distance){
		super.moveForward(distance);

	}
}
