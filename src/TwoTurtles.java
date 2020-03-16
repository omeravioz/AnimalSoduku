package assignment2_fatma;
import Turtle.*;

public class TwoTurtles  {

	public static void main (String [] args){
		Turtle messi= new Turtle();
		Turtle cristiano=new Turtle();

		alef(messi);
		beit(cristiano);
	}

	//this function creates "à" shape 
	public static void alef (Turtle t){

		t.tailUp();
		t.turnRight(90);
		t.moveForward(400);
		t.turnLeft(135);
		t.tailDown();
		t.moveForward(40);
		t.turnRight(45);
		t.moveForward(80);
		t.moveBackward(80);
		t.turnLeft(45);
		t.moveForward(60);
		t.turnLeft(135);
		t.moveForward(70);
		t.moveBackward(70);
		t.turnRight(135);
		t.moveForward(30);


	}

	//this function creates "á" shape 
	public static void beit(Turtle t){
		t.tailDown();
		t.turnLeft(90);
		t.moveForward(150);
		t.moveBackward(100);
		t.turnRight(90);
		t.moveForward(75);
		t.turnLeft(90);
		t.moveForward(100);
	}

}
