package SingleInherit;

public class Dog extends Animal{
	void Bark()
	{
		System.out.println("Barking");
	}
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.eat();
		d.Bark();
	}
}

