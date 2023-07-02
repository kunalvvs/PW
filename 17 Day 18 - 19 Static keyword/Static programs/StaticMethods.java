
class Demo2
{
	static int a;
	
	static
	{
		a=10;
	}
	
	static void disp()
	{
		System.out.println("Static disp "+ a);
	}
}


public class StaticMethods {

	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		Demo2.disp();//can be called without creating object
		
		Demo2 d=new Demo2();// can also be called creating object
		d.disp();

	}

}
