package assignment2_fatma;

public class iguana extends reptiles {
	
	protected int age; //age field
	protected String gender;//gender field
	
	/*default constructor*/
	public iguana(){
		this.age=0;
		this.gender="";
	}
	
	/*Parametric constructor*/
	public iguana (int age, String gender){
		this.age=age;
		this.gender=gender;	
	}
	
	
	public String toString(){
	
	return "iguana"; 

} 
	
}

