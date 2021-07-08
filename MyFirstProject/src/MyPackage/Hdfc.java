package MyPackage;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{

		Hdfc obj=new Hdfc();
		obj.withdrawal();
		obj.deposit();
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("Iam overridden withdrawal in Hdfc");
	}

	@Override
	public void deposit() 
	{
		System.out.println("Iam overridden deposit in Hdfc");
		
	}

}
