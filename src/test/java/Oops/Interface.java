package Oops;
interface java

{
	void j();
}
interface java2
{
	void j2();	
}
public class Interface implements java,java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Interface obj=new Interface();
			obj.j();
			obj.j2();	
		}
	
		public void j()
		{
			System.out.println("Who is taking the Java course for Automation Testing Batch ?");
		}
		public void j2()
		{
			System.out.println("Ashok Reddy :)");
		}	
	}