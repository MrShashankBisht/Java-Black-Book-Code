package sunw.demo.bean3;
import java.beans.*;

public class Bean3BeanInfo extends SimpleBeanInfo 
{
    public PropertyDescriptor[] getPropertyDescriptors() 
    {
        try {
            PropertyDescriptor filled = new
                 PropertyDescriptor("filled", Bean3.class);
            filled.setBound(true);
            PropertyDescriptor propertydescriptor[] = {filled};
            return propertydescriptor;
        }
        catch(Exception e) {}

        return null;
    }
}
