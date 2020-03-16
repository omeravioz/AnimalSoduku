package assignment2_fatma;

import Turtle.Turtle;

public class DrunkTurtle extends Turtle {

	/**
	 * overriding move forward method for drunk turtle:*
	 *  moving forward for random distance, turning left in certain probability (30% ), moving forward for random distance
	 */
	public void moveForward (double distance){
		double dis= Math.random()*distance;	
		MoveAsSover(dis);
		if(Math.random()<0.3){ 
			turnLeft((int)distance);
			MoveAsSover(Math.random()*distance);
		}

	}

	//aid function to make drunk turtle walk as regular one 
	public void MoveAsSover(double distance){
		super.moveForward(distance);

	}

	// overriding method for drunk turtle 
	public void turnLeft (int angle){
		double drunkAngle = Math.random()*2*angle;
		turnLeftDrunk((int)drunkAngle);
	}

	//aid function to make drunk turtle turn left as regular one
	public void turnLeftDrunk(int angle){
		super.turnLeft(angle);
		
	}

	// overriding method for drunk turtle 
	public void turnRight (int angle){
		double drunkAngle = Math.random()*2*angle;
		turnRightDrunk((int)drunkAngle);
	}

	//aid function to make drunk turtle turn right as regular one 
	public void turnRightDrunk(int angle){
		super.turnRight(angle);
		
	}


}
