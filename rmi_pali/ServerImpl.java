import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

	public ServerImpl() throws RemoteException {
		super();
	}
	
	
	public boolean Palindrome(String str1) throws RemoteException {
	
	
		//remove all non-alphanumeric characters and convert to lowercase
		String cleanStr = str1.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();
		
		//check if string is equal to its reverse
		return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
	
	}
	
	
	/*public double Subtraction(double num1,double num2) throws RemoteException {
	
		return num1-num2;
	
	}*/
	
	
	/*public double Multiplication(double num1,double num2) throws RemoteException {
	
		return num1*num2;
	
	}*/
	
	
	/*public double Division(double num1,double num2) throws RemoteException {
		if(num2 !=0) {
		
			return num1/num2;
		}
		else {
			throw new RemoteException("Cannot divide by zero");
		}
		
		//return num1/num2;	
	}*/		
}
	


