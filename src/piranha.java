package assignment2_fatma;

public class piranha extends fish {

	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public piranha(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public piranha (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	
	/**
	 * this method checks for legal insertion with object diagonals (only one piranha in each diagonal)
	 * true/false if insertion is valid according to game rules
	 */
	public boolean canPlaceAnimal(animal[][] a, int row , int col){

		for(int i=row,j=col;i<a.length&&j<a.length;i++,j++)
			if(a[i][j] instanceof piranha)
				return false;

		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(a[i][j] instanceof piranha)
				return false;

		for(int i=row+1,j=col-1;i<a.length&&j>=0;i++,j--)
			if(a[i][j] instanceof piranha)
				return false;
		
		for(int i=row-1,j=col+1;i>=0&&j<a.length;i--,j++)
			if(a[i][j] instanceof piranha)
				return false;

		return true;

	}

	public String toString(){
		return "piranha"; 
	}
}



