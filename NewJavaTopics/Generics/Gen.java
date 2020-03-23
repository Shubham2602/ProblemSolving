package Generics;

public class Gen<T> 
{
	T ob;
	
	public Gen(T o)
	{
		ob = o;
	}
	
	public T getValue() {
		return ob;
	}
}
