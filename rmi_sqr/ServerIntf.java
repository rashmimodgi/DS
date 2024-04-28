import java.rmi.*;

interface ServerIntf extends Remote {

	public double Square(double num1) throws RemoteException;
	
	
}	

