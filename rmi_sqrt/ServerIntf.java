import java.rmi.*;

interface ServerIntf extends Remote {

	public double sqrt(double num1) throws RemoteException;
	
	//public double Subtraction(double num1,double num2) throws RemoteException;
	//public double Multiplication(double num1,double num2) throws RemoteException;
	//public double Division(double num1,double num2) throws RemoteException;
	
}	

