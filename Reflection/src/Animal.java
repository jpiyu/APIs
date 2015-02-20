
public class Animal {
	String name;
	Animal()
	{
		System.out.println("inside the constructor");
	}
	public void setName(String str)
	{
		name = str;
	}
	public void printName()
	{
		System.out.println(name);
	}
}