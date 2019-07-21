import java.lang.management.ManagementFactory;
import javax.management.Descriptor;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.ObjectName;
public class MXBeanTest {
	public static void main(String[] args) throws Exception {
		BookImpl mxBean = new BookImpl();
		ObjectName objectName = new ObjectName(
		"mymxbean:name=with_descriptor");
		MBeanServer server = ManagementFactory.
		getPlatformMBeanServer();
		server.registerMBean(mxBean, objectName);
		MBeanInfo mbeanInfo = server.getMBeanInfo(objectName);
		for (MBeanAttributeInfo attributeInfo : 
		mbeanInfo.getAttributes()) {
			String attributeName = attributeInfo.getName();
			if (attributeName.equalsIgnoreCase("numberOfPages")) {
				System.out.println("Attribute " + attributeName);
				Descriptor descriptor =
				attributeInfo.getDescriptor();
				System.out.println("minValue = " +
				descriptor.getFieldValue("minValue"));
				System.out.println("maxValue = " +
				descriptor.getFieldValue("maxValue"));
			}
		}
	}
}
