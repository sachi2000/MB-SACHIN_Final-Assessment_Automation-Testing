package Oops;

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi Ashok :)");
		OverLoad obj=new OverLoad ();
			obj.main();
			obj.main(2);
			obj.main('a');
			obj.main(3,4);
			
	}		

	void main()
	{
		System.out.println("when is our next Break");
	}
	void main(int a)
	{
		System.out.println("If it get break more then 20 minutes");
	}
	void main(char a)
	{
		System.out.println("We will be happy :)");
	}
	void main(int a,int b)
	{
		System.out.println("Finally Thankyou for 15 minutes of break for coding  ");
		System.out.println("And Again 15 minutes  of break for Refreshment ");
	}
	

	
}




	


