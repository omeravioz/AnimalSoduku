package assignment2_fatma;

public class viper extends reptiles {

	protected int age; //age field
	protected String gender;//gender field

	/*default constructor*/
	public viper(){
		this.age=0;
		this.gender="";
	}

	/*Parametric constructor*/
	public viper (int age, String gender){
		this.age=age;
		this.gender=gender;	

	}
	/**
	 * this method checks for legal insertion of viper object 
	 * (combines one reptile in each column +viperdiagonals checks according to game rules)
	 * return true/false if legal insertion is valid 
	 */
	public boolean canPlaceAnimal(animal[][] a, int row , int col){
		return ((super.canPlaceAnimal(a, row, col))&& oneInADiagonal(a,row, col));
	}

	/**
	 * this method checks for legal insertion with viper diagonals 
	 * @param a animal objects board
	 * @param row index of row
	 * @param col index of col
	 * @return true/false if insertion is valid according to game rules (viper cannot be in same  diagonal with mammal)
	 */
	public boolean oneInADiagonal(animal[][] a, int row , int col){

		for(int i=row,j=col;i<a.length&&j<a.length;i++,j++)
			if(a[i][j] instanceof mammal)
				return false;

		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(a[i][j] instanceof mammal)
				return false;

		for(int i=row+1,j=col-1;i<a.length&&j>=0;i++,j--)
			if(a[i][j] instanceof mammal)
				return false;

		for(int i=row-1,j=col+1;i>=0&&j<a.length;i--,j++)
			if(a[i][j] instanceof mammal)
				return false;

		return true;

	}

	public String toString(){
		return "viper"; 
	}

}
