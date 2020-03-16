package assignment2_fatma;

public class lion extends mammal {

	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public lion(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public lion (int age, String gender){
		this.age=age;
		this.gender=gender;		
}

	/**
	 * this method checks that lion is not locate in same column with other lion or zebra 
	 * @param a animal object board
	 * @param col index of column
	 * @return true or false for valid legal insertion of lion object 
	 */	
	public boolean isValid(animal[][] a, int col ){
		for(int i=0; i<a.length; i++){
			if ((a[i][col] instanceof lion)||(a[i][col] instanceof zebra))
				return false;
		}
		
		return true;		
	}

	/**
	 * this method combines the constrains of mammal object + lion constraint (isValid method)
	 * return true or false for legal insertion of lion object to animal sudoku board  
	 */
	public boolean canPlaceAnimal(animal[][] a, int row , int col){
		return ((super.canPlaceAnimal(a, row, col))&& isValid(a, col));
		
	}
	
	public String toString(){
		
		return "lion"; 
	
	}

}
