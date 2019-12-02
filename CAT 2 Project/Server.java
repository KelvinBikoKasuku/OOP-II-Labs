/**
* <h1> Server </h1>
* This program allows connection from a client program
* @author Kelvin Biko
* @author Abshir Mohammed
* @author Danny Salat
* @author Idris Nasir
* @version 1.0
*/
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Login {
	public Server() {}
	/**
		* This method is used to allow connection between the client and the server
		* This method also displays a message when the server is ready
		* @return void This method returns nothing
		*/
	public static void main(String args[]) {
		try {
			//Instantiating the implementation class
			Login obj = new Login();
			
			//Exporting the object of implementation class
			// (here we are exporting the remote object to the stub)
			Interface stub = (Interface) UnicastRemoteObject.exportObject(obj, 0);
			
			//Binding the remote object (stub) in the registry
			Registry registry = LocateRegistry.getRegistry();
			
			registry.bind("Interface", stub);
			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}	
			