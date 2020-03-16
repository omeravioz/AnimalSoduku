package assignment2_fatma;

public class shark extends fish  {

	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public shark(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public shark (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	
	/**
	 * this method checks for legal insertion (shark cannot placed with other shark and salmon in same square of 2*2)
	 * true/false if insertion is valid according to game rules
	 */
	public boolean canPlaceAnimal(animal [][] a, int row, int col){
		//check if exist value that equal to i on the same square
		int k=row-(row%2);  // k and l will be the initial location in the square
		int l=col-(col%2);
		for(int s=k;s<=(k+1);s++)  
			for(int t=l;t<=(l+1);t++)
				if((a[s][t] instanceof shark)||(a[s][t] instanceof salmon ))
					return false;

		return true;

	}//CheckSquare

	public String toString(){
		return "shark"; 
}

}



