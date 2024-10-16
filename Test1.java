package inheritance;

public class Test1 {
	
	
      
 int a=10;  
 int b=20; 
     }
class Test extends Test1
       {
    int a=100; 
    int b=200;  
void add(int a,int b)
       {
System.out.println(a+b); 

System.out.println(this.a+this.b); 

System.out.println(super.a+super.b);
             }
public static void main(String[] args) 
               {
     Test t=new Test();
      t.add(1000,2000);  
              } 

}