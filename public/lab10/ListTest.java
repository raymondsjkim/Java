/*  
  	Program: Sorted Integer List
    Author: Raymond Kim
    Class: CSCI 145
    Date: 11/13/2017
    Description: This program has a class SortedIntList that extends 
    IntList. SortedIntList is just like IntList except that its
    elements should always be in sorted order from smallest to largest.
	Exception(s): N/A
*/
public class ListTest
{
	public static void main(String[] args)
	{
		IntList myList = new IntList(10);
		IntList sortedList = new SortedIntList(10);
		IntList anotherSortedList = new SortedIntList(10);
		myList.add(100);
		myList.add(50);
		myList.add(200);
		myList.add(25);
		sortedList.add(100);
		sortedList.add(50);
		sortedList.add(200);
		sortedList.add(25);
		anotherSortedList.add(23);
		anotherSortedList.add(21);
		anotherSortedList.add(25);
		anotherSortedList.add(27);
		anotherSortedList.add(28);
		anotherSortedList.add(26);
		System.out.println(myList);
		System.out.println(sortedList);
		System.out.println(anotherSortedList);
	}
}
