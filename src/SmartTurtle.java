package assignment2_fatma;

import Turtle.Turtle;

public class SmartTurtle extends Turtle {


	public void draw (int sides, double size){

		

		int angle = ((180*(sides-2))/sides);
		tailDown();
		for (int i=0; i<sides; i++){
			moveForward(size);
			turnRight(180-angle);

		}

	}

}
