// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************

public class ListTest
{
	public static void main(String[] args)
	{
//		IntList myList = new IntList(10);
		IntList sortedList = new SortedIntList(10);
		
		
		sortedList.add(100);
		sortedList.add(50);
		sortedList.add(200);
		sortedList.add(25);
		
		System.out.println(sortedList);
	}
}
