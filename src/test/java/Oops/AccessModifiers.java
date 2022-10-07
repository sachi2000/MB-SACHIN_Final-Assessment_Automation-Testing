package Oops;
class A
{
    private void a()//scope of this within the class
	{
		System.out.println("Life is full of Automation ");
	}
	void b()
	{
		System.out.println("Life is full of Jira ");
	}
}
public class AccessModifiers extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers  Obj= new AccessModifiers();
		//Obj.a();  The method a from the class A is not visible
		
		Obj.e();//inside the class so it provides the output	
		Obj.b();
	}
	
	 private void e()//scope of this within the class
		{
		 	
			System.out.println("Java Course is taking by Ashok reddy  ");
		}
}

	