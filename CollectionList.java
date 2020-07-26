package collections;

public class CollectionList extends CustomList{
	public CollectionList()
	{
		super();
	}

	public static void main(String args[])
	{
		CollectionList list=new CollectionList();
		list.add(5);
		list.add(6);
		list.add(9);
		System.out.println(list.size());
		System.out.println(list.remove(2));
		System.out.println(list.size());
		
	}
}
