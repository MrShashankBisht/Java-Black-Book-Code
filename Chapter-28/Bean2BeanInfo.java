package sunw.demo.bean2;
import java.beans.*;

public class Bean2BeanInfo extends SimpleBeanInfo 
{
    public PropertyDescriptor[] getPropertyDescriptors() 
    {
        try {
            PropertyDescriptor filled = new
                 PropertyDescriptor("filled", Bean2.class);
            filled.setBound(true);
            PropertyDescriptor propertydescriptor[] = {filled};
            return propertydescriptor;
        }
        catch(Exception e) {}

        return null;
    }
}
