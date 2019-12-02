/**
*<h1>Interface</h1> 
 *This is the interface component of the Remote Invocation
 */

	/**
		* This abstarct method references the UI to be run
		* @return void This method returns nothing
	*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{
	void animation() throws RemoteException;
}