package client;

import java.rmi.*;
import java.math.*;
import Computeapp.*;

public class ComputeappPi {
    public static void main(String args[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            String name = "//" + args[0] + "/Computeapp";
            Computeapp comp = (Computeapp) Naming.lookup(name);
            Pi task = new Pi(Integer.parseInt(args[1]));
            BigDecimal pi = (BigDecimal) (comp.executeTask(task));
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputeappPi exception: " + 
                               e.getMessage());
            e.printStackTrace();
        }
    }
}
