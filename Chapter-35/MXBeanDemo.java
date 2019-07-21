import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;
public class MXBeanDemo {
	public static void main(String[] args) throws Exception {
		CounterMXBean mxBean=new CounterImpl();
		ObjectName objectName=new ObjectName("mymxbean:name=counter");
		MBeanServer server=ManagementFactory.getPlatformMBeanServer();
		server.registerMBean(mxBean, objectName);
		System.out.println("Press Enter to Stop....");
		System.in.read();
	}
}
