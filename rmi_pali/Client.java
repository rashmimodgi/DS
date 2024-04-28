import java.rmi.*;
import java.util.Scanner;

public class Client {
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		try {
		
			ServerIntf access = (ServerIntf) Naming.lookup("rmi://localhost/Server"); //storing object chya reference la access
			
			
			System.out.println("Enter the string : ");
			String str1 = sc.nextLine();
			
			/*System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			
			System.out.println("First number is: " + num1);
			System.out.println("Second number is: " + num2);
			
			*/
			
			System.out.println("Palindrome status : " + access.Palindrome(str1));
			//System.out.println("Subtraction is: " + access.Subtraction(num1,num2));
			//System.out.println("Multiplication is: " + access.Multiplication(num1,num2));
			//System.out.println("Division is: " + access.Division(num1,num2));
			
			
		}
		
		
		catch(Exception ae) {
		
			System.out.println("Exception occured at Client!");	
		}
	}			
	
}	
