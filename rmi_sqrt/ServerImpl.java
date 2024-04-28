import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

	public ServerImpl() throws RemoteException {
		super();
	}
	
	@Override
	public double sqrt(double num1) throws RemoteException {
	
		return Math.sqrt(num1);
	
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
	


