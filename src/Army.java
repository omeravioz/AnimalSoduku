package assignment2_fatma;
import java.util.Scanner;

import Turtle.Turtle;


public class Army {

	public static Scanner sc= new Scanner(System.in);	
	static Turtle[] kawbanga = new Turtle[5];

	public static void main(String[] args){

		insertion(); //insert the turtles by user choice 
		locateTurtels(kawbanga); //locating the turtles in their positions
		walkInSpace(kawbanga); // the actions that each turtle takes
		disappear(kawbanga); //hiding the turtles from the gui board 

	}		

	public static void menu (){
		// crates menu for picking turtle 
		System.out.println("Choose the type of a turtle:");
		System.out.println("1.	Simple");
		System.out.println("2.	Smart");
		System.out.println("3.	Drunk");
		System.out.println("4.	Jumpy");
		System.out.println("5.	Eight");



	} 

	public static void insertion(){
		// Translate the input to turtle type
		for (int i=0; i<5; i++){
			menu();
			int num= sc.nextInt();
			if (num==1) 
				kawbanga[i]=new Turtle();
			if (num==2) 
				kawbanga[i]=new SmartTurtle();	
			if (num==3) 
				kawbanga[i]=new DrunkTurtle();	
			if (num==4) 
				kawbanga[i]=new JumpyTurtle();
			if (num==5) 
				kawbanga[i]=new EightTurtle();


		}


	} 

	public static void locateTurtels( Turtle[] a){
		int dis=480;//the total distance between 5 turtels, 4 spaces *120 
		for (int i=0; i<a.length; i++){
			a[i].tailUp();

			if (a[i] instanceof DrunkTurtle){ //Different  walk for durnk turtle 
				((DrunkTurtle)a[i]).turnLeftDrunk(90);
				((DrunkTurtle)a[i]).MoveAsSover(dis);
				((DrunkTurtle)a[i]).turnRightDrunk(90);
			}

			else{ // walk for the rest of the turtles
				a[i].turnLeft(90);
				a[i].moveForward(dis);
				a[i].turnRight(90);
			}



			a[i].tailDown();
			dis=dis-120;
		}

	}

	public static void walkInSpace(Turtle[] a){
		// walking orders by game rules for each turtle
		walk(65);
		turnLeft(40);
		walk(75);
		draw();

	}


	public static void disappear(Turtle[] a){
		//hide the turtles from game board 
		for (int i=0; i<a.length; i++)
			a[i].hide();

	}


	public static void  walk(int distance){
		for(int i=0; i<kawbanga.length; i++)
			kawbanga[i].moveForward(distance);

	}

	public static void  turnLeft(int degrees){
		for(int i=0; i<kawbanga.length; i++)
			kawbanga[i].turnLeft(degrees);
	}

	public static void  walkFarward75(int distance){
		for(int i=0; i<kawbanga.length; i++)
			kawbanga[i].moveForward(distance);

	}
	public static void draw(){
		for(int i=0; i<kawbanga.length; i++)
			if (kawbanga[i] instanceof SmartTurtle){
				((SmartTurtle)kawbanga[i]).draw(6, 40);
			} 

	}

}

