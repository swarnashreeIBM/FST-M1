package hello;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Car car1= new Car("Red","FM", 2024, 20);
		Car car2= new Car("yellow","TM", 2020, 10);
		
		System.out.println(car1.color);
		System.out.println(car2.speed);
		System.out.println(car1.make);
		System.out.println(car1.speed);
		//System.out.print(car1.accelarator());
		
	}

}
