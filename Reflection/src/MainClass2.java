
import static java.lang.System.*;
import java.lang.reflect.Method;
public class MainClass2 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("NewClass");
		NewClass nc = (NewClass)c.newInstance();
		Method m = c.getDeclaredMethod("showSomething",null);
		m.setAccessible(true);
		m.invoke(nc, null);
	}
}
