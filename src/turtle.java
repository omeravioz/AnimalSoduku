package assignment2_fatma;

public class turtle extends reptiles {
	
	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public turtle(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public turtle (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	
	public String toString(){
		
		return "turtle"; 
	}
}
