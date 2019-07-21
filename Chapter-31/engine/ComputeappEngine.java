package engine;

import java.rmi.*;
import java.rmi.server.*;
import Computeapp.*;

public class ComputeappEngine extends UnicastRemoteObject
                           implements Computeapp
{
    public ComputeappEngine() throws RemoteException {
        super();
    }

    public Object executeTask(Task t) {
        return t.execute();
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        String names = "//host/Computeapp";
        try {
            Computeapp engine = new ComputeappEngine();
            Naming.rebind(names, engine);
            System.out.println("ComputeappEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeappEngine exception: " + 
			       e.getMessage());
            e.printStackTrace();
        }
    }
}
