import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

	public ServerImpl() throws RemoteException {
		super();
	}
	
	@Override
	public boolean compareStrings(String str1,String str2) throws RemoteException {
	
		return str1.equals(str2);
	
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
	


