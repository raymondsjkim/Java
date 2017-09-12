/*
  ENUMERATED TYPES
*/
public class IceCream {
	enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee,
        rockyRoad, mintChocolateChip, cookieDough}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Flavor cone1, cone2, cone3;

	      cone1 = Flavor.rockyRoad;
	      cone2 = Flavor.chocolate;

	      System.out.println("cone1 value: " + cone1); // rockyRoad
	      System.out.println("cone1 ordinal: " + cone1.ordinal()); // 5
	      System.out.println("cone1 name: " + cone1.name()); // rockyRoad
	      System.out.println();
	      System.out.println("cone2 value: " + cone2);
	      System.out.println("cone2 ordinal: " + cone2.ordinal()); // 1
	      System.out.println("cone2 name: " + cone2.name()); // chocolate

	      cone3 = cone1; 

	      System.out.println();
	      System.out.println("cone3 value: " + cone3); // rockyRoad
	      System.out.println("cone3 ordinal: " + cone3.ordinal()); // 5
	      System.out.println("cone3 name: " + cone3.name());

	}

}
