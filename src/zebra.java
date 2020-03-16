package assignment2_fatma;

public class zebra extends mammal {
	
	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public zebra(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public zebra (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	/**
	 * this method combines the constrains of mammal object + zebra constraint (isValid method)
	 * return true or false for legal insertion of zebra to animal sudoku board  
	 */
	public boolean canPlaceAnimal(animal[][] a, int row , int col){
		return ((super.canPlaceAnimal(a, row, col))&& isValid(a, col));
	}

	/**
	 * this method checks that zebra is not locate in same column with lion (according to game rules) 
	 * @param a animal object board
	 * @param col index of column
	 * @return true or false for valid legal insertion of zebra  object
	 */
	public boolean isValid(animal[][] a, int col){
	for(int i=0; i<a.length; i++){
			if (a[i][col] instanceof lion)
				return false;
		}
return true;
}

	public String toString(){
		return "zebra"; 
	}
}