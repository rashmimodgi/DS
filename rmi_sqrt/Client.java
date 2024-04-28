import java.rmi.*;
import java.util.Scanner;

public class Client {
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		try {
		
			ServerIntf access = (ServerIntf) Naming.lookup("rmi://localhost/Server"); //storing object chya reference la access
			
			
			System.out.println("Enter number: ");
			double num1 = sc.nextDouble();
			
			
			System.out.println("Square root of given number is : " + access.sqrt(num1));
			
			
		}
		
		
		catch(Exception ae) {
		
			System.out.println("Exception occured at Client!");	
		}
	}			
	
}	
