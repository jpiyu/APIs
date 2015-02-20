import static java.lang.System.*;
public class MainClass {
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("Animal");
		System.out.println(c1.getName());
		Class c2 = Class.forName("Interface1");
		if(c2.isInterface())
		{
			System.out.println(c2.getName() + " is an interface");
		}
		System.out.println("now lets see how to call a method");
		
		Class c3 = Class.forName("Animal");
		Animal a = (Animal)c3.newInstance();
		a.setName("Lion");
		a.printName();
	}
}
