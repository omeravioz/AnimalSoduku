package assignment2_fatma;

abstract public class fish extends animal {

	//fields
	protected int age; //age field
	protected String gender;//gender field
	
	//Constructors
	/*default constructor*/
	public fish(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public fish (int age, String gender){
		this.age=age;
		this.gender=gender;	
	
	}
	
	//methods
	
	public abstract String toString();
	
	
	/**
	 * this method checks for legal insertion of fish object
	 * return true or false for legal insertion in specific location
	 */
	public abstract boolean canPlaceAnimal(animal[][] board,int m,int n);
}
