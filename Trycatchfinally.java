import java.util.*;
public class trycatchfinally {
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
				System.out.println("Enter the year : ");
				int year = sc.nextInt();
				
			try
			{
				if(year>2024) 
				{
				throw new IllegalStateException(" year cannot be greater than 2024");	
				}
			}
			catch(IllegalStateException e) 
			{
				System.out.println("Exception caught"+e.getMessage());
			}
			finally 
			{
				System.out.println("Code excecuted");
				}
			}
		}
