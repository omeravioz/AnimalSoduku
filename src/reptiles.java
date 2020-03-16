package assignment2_fatma;

abstract public class reptiles extends animal {
	//fields
	
	protected int age; //age field
	protected String gender;//gender field
	
	
	//Constructors
	/*default constructor*/
	public reptiles(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public reptiles (int age, String gender){
		this.age=age;
		this.gender=gender;	
	
	}
	//methods

/**
 * this method checks for legal insertion of reptile object (only one reptile in each column according to game rules)
 * return true/false if legal insertion is valid 	
 */
	public boolean canPlaceAnimal(animal[][] a,int row,int col){
		
		for (int i=0; i<a.length; i++){
			if (a[i][col] instanceof reptiles)
					 return false;
		}		
	return true;
	}

	public abstract String toString();
	
}
