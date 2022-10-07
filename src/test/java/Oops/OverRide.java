package Oops;

import java.util.Scanner;

class CompanyDetails
{
	public String Company="Dlithe";
	public String Location="Bangalore";
	void name_and_location()
	{
		System.out.println("\nEmployment Company is "+Company);
		System.out.println("Employment Company is "+Location);
	}
	
}

public class OverRide extends CompanyDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee name ");
		OverRide obj=new OverRide();
		obj.EmployeeDetails();
	}
	
     void EmployeeDetails()
	{
    	 Scanner Input= new Scanner(System.in);
		 String name= Input.next();
		
	
	 switch(name )
	{
	 case "Arun" :
		 super.name_and_location(); //Method Overriding
		 System.out.println("Employment Id :1");
		 System.out.println( name+"is Founder and Director of the Dlithe Company");
		 System.out.println( name+"Salary is :100000");
		
		 break;
		 
	 
	 case "Ranjitha" :
		 super.name_and_location(); //Method Overriding
		 System.out.println("Employment Id 10");
		 System.out.println(name+" is  Manual Testing Trainer of the Dlithe Company");
		 System.out.println( name+"Salary is :70000");
		 break;
	 
	 case "Ashok" :
		 super.name_and_location(); //Method Overriding
		 System.out.println("Employment Id 234");
		 System.out.println(name+"is  Automation Testing Trainer of the Dlithe Company");
		 System.out.println( name+"Salary is :75000");
		 break;
	 default :
		 System.out.println("Invalid Employee Name");
	 
	 
	 
	 
	}
	
	}
}

		
		

