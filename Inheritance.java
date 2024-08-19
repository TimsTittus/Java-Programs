import java.util.*;
class Employee
{		
	String name= new String();
	String Adress;
	int age ;
	long phoneNumber;
	int salary;	
		void printsalary() 	
	{		
		System.out.println("Salary:"+salary);		
	}		
	void printEmployee()		
	{		
		System.out.println("\nName:"+name+"\nAge: "+age+" \n Phone NO:"+phoneNumber+"\nAdress"+Adress);		
	}	
}
class Officer extends Manager

{
	String Specialization = new String();
	void print_Specialization() 
	
	{
		System.out.println("Specialization :"+Specialization);
		
	}
}
class Manager extends Employee
{
	String department= new String();
	void print_Department() 
	
	{
		System.out.println("Department :"+department);
		
	}
}
 public class Inheritance {
		public static void main(String[] args)	
		{
			Scanner sc=new Scanner(System.in);									
			Officer off = new Officer();
			Manager mngr = new Manager();
						
			System.out.println("\n Enter the officer name");
			off.name=sc.nextLine();
			
			System.out.println("\n Enter the officer Adress");
			off.Adress=sc.nextLine();
			
			System.out.println("\n Enter the officer Specialization");
			off.Specialization=sc.nextLine();
			
			System.out.println("\n Enter the age");
			off.age=sc.nextInt();
			
			System.out.println("\n Enter the Phone Number ");
			off.phoneNumber=sc.nextLong();
			
			System.out.println("\n Enter the Salary ");
			off.salary=sc.nextInt();
			
			sc.nextLine();
			System.out.println("\n Enter the Manager name");
			mngr.name=sc.nextLine();

			System.out.println("\n Enter the Manger Adress");
			mngr.Adress=sc.nextLine();
			
			System.out.println("\n Enter the Department of");
		    mngr.department=sc.nextLine();
		    
			System.out.println("\n Enter the age");
			mngr.age=sc.nextInt();
			
			System.out.println("\n Enter the Phone Number ");
			mngr.phoneNumber=sc.nextLong();

			System.out.println("\n Enter the Salary ");
			mngr.salary=sc.nextInt();
			
			System.out.println("\n");
			
			System.out.println("OFFICER DETAILS  :");
			off.printEmployee();
			off.print_Specialization();
			off.printsalary();
						
			System.out.println("\n");
						
			System.out.println("MANAGER DETAILS  :");
			mngr.printEmployee();
			mngr.print_Department();
			mngr.printsalary();			
		}
	}