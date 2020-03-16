package assignment2_fatma;

import java.util.Scanner;
public class sodukuAnimals {
	public static Scanner sc = new Scanner(System.in);
	static animal[][]copyanimal=new animal[6][6];
	static animal[][]sodukuAnimals=new animal[6][6];
	static animal[]animalconverter={new monkey(),new zebra(),new lion(),new viper(),new iguana(),new turtle()		
	,new shark(),new piranha(),new salmon()};

	static int r,c,s;
	static boolean flag=false;

	public static void main(String[] args) {
		solveAnimalSudoku();
	}
	
	/**
	 * ** SolvedSudoku function
	 * this function running the sudoku game :
	 * 	1.getting Given animal from the user and locate them on sudoku board
	 * 	2. initializing the other cells (null for cells that was not given animal object by user) at board; 
	 * 	3. if solution for the animal sudoku is exist then sudoku board is printed	
	 * 	4. else it prints "No valid solution " 	
	 */ 
	public  static void solveAnimalSudoku(){
		
		menu();
		insertion();
		if(LookingForSolution()==true){
			PrintSolution(sodukuAnimals);
			}
		else
			System.out.println("No valid solution");
	}
	
	/**
	 * creates menu for user
	 */
	public static void menu(){
		System.out.println("Welcome to java Sudoku! To start the game press enter");
		String enter=sc.nextLine();


	}
	/**
	 * this function converting input string from user to index isertion and object to insert in specific location
	 */
	public static void insertion(){
		String animal="";
		do{
			System.out.println("Please enter a given animal and its location");	
			animal=sc.nextLine();
			int rowIndex=Integer.parseInt(String.valueOf(animal.charAt(0)));
			int colIndex=Integer.parseInt(String.valueOf(animal.charAt(1)));
			animalInsertion(rowIndex, colIndex,animal.substring(2));

		}
		while((animal.length()!=2)||((animal.charAt(0)!='0')&&(animal.charAt(1)!='0')));
	}

/**this function analyze input string from user 
 * and insert specific animal object to 2 arrays: animal sudoku game board, temp board for given object by users (other cells initiate with null)
 * @param row index of row 
 * @param col index of col 
 * @param name the name of animal to insert into sudoku board
 */
	
	public static void animalInsertion(int row,int col,String name){

		if(name.equals(iguana.class.getSimpleName())){
			sodukuAnimals[row][col]=new iguana();
			copyanimal[row][col]=new iguana();
		}
		if(name.equals(monkey.class.getSimpleName())){
			sodukuAnimals[row][col]=new monkey();
			copyanimal[row][col]=new monkey();
		}
		if(name.equals(zebra.class.getSimpleName())){
			sodukuAnimals[row][col]=new zebra();
			copyanimal[row][col]=new zebra();
		}
		if(name.equals(lion.class.getSimpleName())){
			sodukuAnimals[row][col]=new lion();
			copyanimal[row][col]=new lion();
		}
		if(name.equals(viper.class.getSimpleName())){
			sodukuAnimals[row][col]=new viper();
			copyanimal[row][col]=new viper();
		}
		if(name.equals(turtle.class.getSimpleName())){
			sodukuAnimals[row][col]=new turtle();
			copyanimal[row][col]=new turtle();
		}
		if(name.equals(shark.class.getSimpleName())){
			sodukuAnimals[row][col]=new shark();
			copyanimal[row][col]=new shark();
		}
		if(name.equals(piranha.class.getSimpleName())){
			sodukuAnimals[row][col]=new piranha();
			copyanimal[row][col]=new piranha();
		}
		if(name.equals(salmon.class.getSimpleName())){
			sodukuAnimals[row][col]=new salmon();
			copyanimal[row][col]=new salmon();	
		}

	} // end of....

	/**LookingForSolution function
	 * this function is searching for legal solution by checking every cell in the animal sudoku board:
	 * 	
	 * 	for each cell in the board ( row +cell):
	 * 		1. if the object in current cell is legal then continue to next cell on board
	 * 		2. else - check for alternative solution 
	 *		3. if solution not found return false
	 * 		4. return true (animal sudoku solution is exist) 
	 * 
	 * @return true if solution for animal sudoku board is exist , false - solution for animal sudoku isn't exist
	 */

	public static boolean LookingForSolution(){
		for (r=0; r< copyanimal.length; r++){ 
			for (c=0; c < copyanimal.length; c++){
				if(currentLocation(r,c)){
					continue;
				}

				if(FixSolution())
					continue;
				else
					return false;
			}

		}//for
		return true;	
	}//LookingForSolution

	/**
	 * this function checks for legal animal object on current cell on animal sudoku board and insert it (if possible -animal object, else- null)
	 * @param row index of row
	 * @param col index of col
	 * @return true - if animal object in current location is legal , false if legal animal for cell was not found. 
	 */
	public static boolean currentLocation(int row, int col ){

		if(CheckGivenLocation(copyanimal[row][col])==false){
			s=0;
			animal i;
			while(legalSize(s)){
				if(flag==true){
					i=findanimal();
					if(i==null)
						break;
					flag=false;
				}
				else
					i=animalconverter[s];

				if(CheckLegalBoard(sodukuAnimals,row,col,i)){
					sodukuAnimals[row][col]=i;
					/*PrintSolution(sodukuAnimals);*/
					return true;
				}//if
				else{
					s++;

				}
			}//while
			sodukuAnimals[row][col]=null;
			/*PrintSolution(sodukuAnimals);*/
			return false;
		}//if
		return true;

	}
	public static boolean CheckGivenLocation(animal Squarevalue){
		//check if the current location is Given animal object or not
		if(Squarevalue!=null)
			return true;
		return false;

	}//CheckGivenLocation

	public static boolean legalSize(int s){
		if(s>8)
			return false;
		return true;
	}

	public static boolean CheckLegalBoard(animal[][] board,int m,int n,animal i){
		//checks if possible  inseret the animal in the current location by the rules of animalsudoku
		if(i.canPlaceAnimal(board, m, n)==false)
			return false;
		return true;

	}

	/**
	 * this function dealing with "dead end" situation - in case that animal object cannot be input to the animal sudoko due to restrictions of game rules,
	 * and searching for alternative solution to fix it.
	 * 
	 * the function search for the last animal that is not given  and raise it by 1 to next animal object
	 *  (accordding to given priority of animal objects) 
	 * 
	 * @return true if alternative and fixing solution is exist in case of "dead end", false - such solution dosent exist
	 */
	public static boolean FixSolution(){
		//the function search for the last number that is not given number and raise him in one.
		for(int i=r;i>=0;i--){
			for(int j=c;j>=0;j--){
				if(i==0&&j==0) //the algorithm didn't find solution
					return false;

				if(j>0&&copyanimal[i][j-1]==null){ //if the current location is not j=0
					r=i;
					c=j-2;
					flag=true;
					return true;
				}//if

				if(j==0){ //if the current location is j=0
					if(copyanimal[i-1][copyanimal.length-1]==null){
						r=i-1;
						c=copyanimal.length-2;
						flag=true;
						return true;
					}
					else{
						j=copyanimal.length;
						i=i-1;
					}
				}//if
			}
		}//for
		return false;	
	}//FixSolution

	/** this program prints the sudoku game board by constant role of spaces for each animal in the sudoku
	 * 
	 * @param sodukuAnimals -sudoku board 
	 */
	public static void PrintSolution(animal[][] sodukuAnimals) {
		for(int i=0;i<sodukuAnimals.length;i++){
			System.out.println();
			for(int j=0;j<sodukuAnimals.length;j++){
				System.out.print(sodukuAnimals[i][j]);// prints name of object 
				for (int k=0 ; k<=(10-(sodukuAnimals[i][j].toString().length()));k++) // number of spaces required 
					System.out.print(" ");
			}//col index
		}// row index

	}//print solution

	/**
	 * this function finds the animal in the current location and convert it to object 
	 * @return animal object 
	 */
	public static animal findanimal(){
		for(int i=0;i<animalconverter.length;i++)

			if((sodukuAnimals[r][c].toString().equals(animalconverter[i].toString()))&&i<8){

				s=i+1;
				return animalconverter[i+1];
			}

		return null;
	}
}// of findanimal
