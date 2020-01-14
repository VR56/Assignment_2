import java.util.*;

class vehicle
{
	int wheels;
	int seats;
	String model;

	public vehicle(int wheels,int seats,String model)
	{
		this.wheels=wheels;
		this.seats=seats;
		this.model=model;
	} 

	protected vehicle()
	{
		wheels=4;
		seats=5;
		model="fortuner";
	}
}

class construct{

	public static void main(String[] args)
	{
		vehicle car=new vehicle();
		System.out.println("Wheels = "+car.wheels+", Seats = "+car.seats+", Model = "+car.model);

		vehicle scooter=new vehicle(2,2,"chetak");
		System.out.println("Wheels = "+scooter.wheels+", Seats = "+scooter.seats+", Model = "+scooter.model);
	}
}