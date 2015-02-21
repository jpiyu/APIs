import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class GenericClassDemo {
	public static void main(String[] args)
	{
		GenericClass<Integer> gc1 = new GenericClass<Integer>();
		gc1.add(1);
		gc1.add(2);
		System.out.println(gc1.get());
		GenericClass<String> gc2 = new GenericClass<String>();
		gc2.add("piyush");
		System.out.println(gc2.get());
	}
}
class GenericClass<T>
{
	T t;
	public void add(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return this.t;
	}
}