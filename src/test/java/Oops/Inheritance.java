package Oops;

class TranferFund
{
	 void verifytranferfund()
	{
		System.out.println("Inorder to know the your Tranfer Fund");
	}
}
class  Login1 extends TranferFund
{
	 void verifylogin()
		{
			System.out.println("1st step is login Process");
		}
}



public class Inheritance extends Login1    {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj= new Inheritance();
		obj.verifytranferfund();
		obj.verifylogin();
		obj.verifyaddbenificiary();	

	}
	void verifyaddbenificiary()
	{
		System.out.println("2nd Step is to add all the Benificiary details");
	}

}


