package inheritance;
class SuperClass1
{
	void login()
	{
		System.out.println("login");
	}
}

class searchitem extends SuperClass1
{
	void searching()
	{
	System.out.println("searching the product");
    }
}

public class Multilevel_Inheritance extends searchitem
{	
	void addtocart()
	{
	System.out.println("Adding the product to cart");
	}
	public static void main(String[] args) {
	
		Multilevel_Inheritance m1=new Multilevel_Inheritance();
		;
		m1.login();
		m1.searching();
		m1.addtocart();
	}

}
