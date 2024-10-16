package inheritance;

public class Inheritance {
	
void abc()
{
	System.out.println("super class");
}
}
class Subclass2 extends Inheritance
{
	void fgh()
	{
		System.out.println("child class2");

	}
}

class Subclass extends Subclass2
{
	void cde()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Subclass s1 =new Subclass();
	s1.abc();
	s1.cde();
	
	Subclass2 s2 =new Subclass2();
	s2.fgh();
	

		
	}

	
}
