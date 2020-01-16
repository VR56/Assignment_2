import java.util.*;

class Cat
{
	void strength()
	{
		System.out.println("A general cat");
	}
}
class Tiger
{
	void strength()
	{
		System.out.println("The natural Predator");
	}
}
class Lion
{
	void strength()
	{
		System.out.println("The King Of the Jungle");
	}
}

class main
{
	public static void main(String[] args)
	{
		Tiger tiger = new Tiger();
		tiger.strength();
		Cat cat = new Cat();
		cat.strength();
		Lion lion = new Lion();
		lion.strength();
	}
}