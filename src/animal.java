package assignment2_fatma;

abstract public class animal {

	protected int age; //age field
	protected String gender;//gender field

	/*default constructor*/
	public animal(){
		this.age=0;
		this.gender="";
	}

	/*Parametric constructor*/
	public animal (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}

	/**
	 * this methos creates string of object type/animal 
	 */
	public abstract String toString();

	/**
	 * this method checks for legal object insertion
	 * @param board animal sudoku objects
	 * @param m index of row
	 * @param n index of col
	 * @return true if insertion is valid and legal . false if not 
	 */
	public abstract boolean canPlaceAnimal(animal[][] board,int m,int n);

}

