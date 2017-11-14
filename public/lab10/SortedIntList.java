// ****************************************************************
// SortedIntList.java
// ****************************************************************
public class SortedIntList extends IntList {
	protected int[] list;
	protected int numElements = 0;
	int size;
	public SortedIntList(int size) {
		super(size);
		list = new int[size];
	
	}
	public void add(int value)
	{
		if (numElements == list.length) {
			System.out.println("Can't add, list is full");
		} else {
		       list[numElements] = value;
		       for(int i = 0; i < numElements; i++){
		             if(value < list[i]){        
		                 for(int j = numElements - 1; j >= i; j--){
		                      list[j+1]= list[j];
		                  }
		                  list[i] = value;
		                  break;
		            }
		        }
		       numElements++;
		}
	 }
	 //-------------------------------------------------------------
	 // Returns a string containing the elements of the list with their
	 // indices.
	 //-------------------------------------------------------------
	 public String toString()
	 {
		 String returnString = "";
		 for (int i = 0; i < numElements; i++) {
			 returnString = returnString + i + ": " + list[i] + "\n";
		 }
		 return returnString;
	 }
}
