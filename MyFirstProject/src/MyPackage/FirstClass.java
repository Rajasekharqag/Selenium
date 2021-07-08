package MyPackage;

public class FirstClass 
{
	int a=10,b=20,c=0;
	public void add() 
	{
		c=a+b;
		System.out.println("sum of a & b is" +  c );
				
	}
	public void sub()
	{
		c=a-b;
		System.out.println("sub of a & b is" + c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("hi class");
		System.out.println("hello my first class creation");
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1=new FirstClass();
		obj1.sub();
		obj1.add();

		
	}
		
}
