package hello;

public class Car {
//Properties
	String color;
	String transmission;
	int make;
	double speed;
	
	//Constructor 
	Car (String color, String transmission, int make, double speed){
		this.color= color;
		this.transmission= transmission;
		this.make =make;
		this.speed = speed;
	}
	public void accelarator() {
		this.speed +=5;
		
	}
	
	public void brake() {
		this.speed =0;
		
	}
	
}
