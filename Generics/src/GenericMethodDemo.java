import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class GenericMethodDemo {
	public static void main(String[] args)
	{
		FirstClass fc = new FirstClass();
		Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        fc.sort(intArray);
        fc.sort(doubleArray);
        fc.sort(charArray);
	}
}
class FirstClass
{
	public static <T> void sort(T[] array)
	{
		int i = 0;
		Arrays.sort(array);
		for(T num : array)
		{
			System.out.println("Element no " + i++ + " -> " + num);
		}
	}
}