
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
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else
		 {
	        list[numElements] = value;
	        for(int i = 0; i < numElements; i++){
	            //May be I should use a nested loop?
	            //for(k = 0; k <)
	             if(value < list[i]){
	                 for(int j= numElements-1; j>=i; j--){
	                      list[j+1]= list[j];
	                      System.out.println(list[j]);
	                  }
	             
	            }
	        }
	        numElements++;
			
		 }
	 }

	
}
