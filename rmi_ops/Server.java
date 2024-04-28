import java.rmi.*;

public class Server {

	public static void main(String args[]) {
	
		try {
			ServerImpl obj = new ServerImpl();
			Naming.rebind("Server",obj);
		}
		
		catch(Exception ae) {
		
			ae.printStackTrace();
			System.out.println("Exception occured at Server!");	
		}
	}			
	
}	


