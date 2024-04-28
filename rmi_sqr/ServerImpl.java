import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

	public ServerImpl() throws RemoteException {
	
	}
	
	
	public double Square(double num1) throws RemoteException {
	
		return num1*num1;
	
	}
	
	
			
}
	


