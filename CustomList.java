package collections;
import java.util.*;
public class CustomList 
{

	private int size=0;
	//default capacity is 10
	private  static final int DEFAULT_SIZE=10;
	int ele[];
	public CustomList()
	{
		ele=new int[DEFAULT_SIZE];
		
		
	}
	//method for appending elements in the list
	public void add(int n)
	{
		if(size==ele.length)
			capacity();

		ele[size++]=n;
	}
	//method for increasing the capacity of the list
	public void capacity()
	{
		int newsize=ele.length*2;
		ele=Arrays.copyOf(ele, newsize);
		
	}
	//method for returning the element by index
	public int get(int i)
	{
		if(i<0 || i>size)
		{
			throw new IndexOutOfBoundsException("Index: "+i+",size "+i);
		}
		return ele[i];
	}
	//method return size of the elements
	public int size()
	{
		return size;
	}
	@Override
	//method to converting the list into  string
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++)
		{
			sb.append(((Integer)ele[i]).toString());
			if(i<size-1)
			{
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	@SuppressWarnings("unchecked")
	//method  for removing an element by index from list
	public int remove(int i)
	{
		if(i>size||i<0)
		{
			throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
			
		}
		int item=ele[i];
		int numel=ele.length-(i+1);
		System.arraycopy(ele, i+1, ele, item, numel);
		size--;
		return item;
	}
	
}
