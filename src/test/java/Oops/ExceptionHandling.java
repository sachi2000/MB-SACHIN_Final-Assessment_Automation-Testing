package Oops;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling obj=new ExceptionHandling();
		obj.a();	
	}
	void a()
	{
		try
		{
			int y[]=new int[6];
			y[7]=10/0; //If we give both exception but its give the output as Arithmetic Exception
			y[8]=1;
			System.out.println("No Exception");		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Has Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Has ArrayIndexOutOfBoundsException ");
		}
		// According to the BODMAS it always give the Arithmetic Exception as its Output in multiple Exception
	}
}


	


