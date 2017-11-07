public class Stars
{
    //-----------------------------------------------------------------
    //  Prints a triangle shape using asterisk (star) characters.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
    		// triangle
        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();
        // rectangle
        for(int x = 0; x < 1; x++) {
        		for(int b = 0; b < 6; b++) {
        			System.out.println("******");
        		}
        }
    }
}
