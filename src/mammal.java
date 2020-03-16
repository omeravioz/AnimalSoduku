package assignment2_fatma;

abstract public class  mammal extends animal {

	//fields
	protected int age;
	protected String gender;

	//Constructors

	public mammal(){
		this.age=0;
		this.gender="";
	}

	public mammal (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}


	//methods


	/**
	 * this method combines row and diagonal check for each mammal objects (according to game rules)
	 * return true or false for legal insertion in specific location
	 */

	public boolean canPlaceAnimal(animal[][] a, int row , int col){
		if(oneInADiagonal(a, row, col)==false||oneInARow(a, row)==false)
			return false;
		return true;
	}

	/**
	 * his method checks for legal insertion with object row
	 * @param a animal objects board
	 * @param row index of row 
	 * @return true/false if only one mammal object is exist in a row
	 */
	public boolean oneInARow (animal[][] a, int row){

		for (int i=0; i<a.length; i++){
			if (a[row][i] instanceof mammal)
				return false;
		}		
		return true;
	}

	/**
	 * this method checks for legal insertion with object diagonals 
	 * @param a animal objects board
	 * @param row index of row
	 * @param col index of col
	 * @return true/false if insertion is valid according to game rules (viper cannot be in diagonal with mammal)
	 */

	public boolean oneInADiagonal (animal[][] a, int row , int col){

		for(int i=row,j=col;(j<a.length)&&(i<a.length);i++,j++)
			if(a[i][j] instanceof viper)
				return false;

		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(a[i][j] instanceof viper)
				return false;

		for(int i=row+1,j=col-1;i<a.length&&j>=0;i++,j--)
			if(a[i][j] instanceof viper)
				return false;

		for(int i=row-1,j=col+1;i>=0&&j<a.length;i--,j++)
			if(a[i][j] instanceof viper)
				return false;

		return true;
	}

	public abstract String toString();
}
