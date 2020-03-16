package assignment2_fatma;

public class monkey extends mammal {

	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public monkey(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public monkey (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	
	public String toString(){
		return "monkey"; 
	}

}