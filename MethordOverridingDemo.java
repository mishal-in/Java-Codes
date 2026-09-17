class Vehicle{
	void run(){
		System.out.println("BCA DEPT IS GOOD ");
	}
}

class Car extends Vehicle{
	@Override
	void run(){
		System.out.println("The Best DEPT Of Gems College");
	}
}

public class MethordOverridingDemo{
	public static void main(String[]args){
		Vehicle v=new Vehicle();
		v.run();
		
		Car c=new Car();
		c.run();
		
		Vehicle obj=new Car();
		obj.run();
	}
}