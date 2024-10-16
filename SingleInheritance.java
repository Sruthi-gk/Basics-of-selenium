package inheritance;

class Super
{
	void loginwithmobile()
	{
	System.out.println("login with mobile number");
    }
}
public class SingleInheritance extends Super {

	void loginwithemail()
	{
	System.out.println("login with email id");
    }
	
	public static void main(String[] args)
	{
		
		SingleInheritance s1=new SingleInheritance();
		s1.loginwithemail();
		s1.loginwithmobile();
	}
	

}
