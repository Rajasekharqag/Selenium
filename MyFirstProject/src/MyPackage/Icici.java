package MyPackage;

public class Icici implements Rbi
{

	

	public static void main(String[] args) {
		Icici i=new Icici();
		i.deposit();
		i.withdrawal();
	}
	@Override
	public void withdrawal() 
	{
		System.out.println("Iam overridden withdrawal in Icici");
	}

	@Override
	public void deposit() 
	{
		System.out.println("Iam overridden deposit in Icici");
		
	}
}
