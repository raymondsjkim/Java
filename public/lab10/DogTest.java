// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
    		Dog yorky = new Yorkshire("Mel");
    		Dog lab = new Labrador("Zay", "blue");
		System.out.println(lab.getName() + " says " + lab.speak() + " and average weight is " + lab.avgBreedWeight());
		System.out.println(yorky.getName() + " says " + yorky.speak() + " and average weight is " + yorky.avgBreedWeight());
    }
}
