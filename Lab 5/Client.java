/**
*<h1>Client Registry</h1>
*This program enables the client to call a remote object using the registry
*@author Danny Salatt
*@author Kelvin Biko
*@author Abshir Mohammed
*@author
*@version 1.0 
*/
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private Client() {}
	/** This is the main method used to access the registry
	*@param args Unused.
	*@return Nothing.
	*/
	public static void main(String[] args) {
		try {
			//Getting the registry
			Registry registry = LocateRegistry.getRegistry(null);
			
			//Looking up the registry for the remote object
			Interface stub = (Interface) registry.lookup("Interface");
			
			//Calling the remote method using the obtained object
			stub.animation();
			
			
			//System.out.println("Remote method invoked");
		} 
	/**
	*exception handler for Exception e
	*prints out an error message when an exception is caught
	*@exception Exception e
	*@see Exception e
	*/
		catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}	