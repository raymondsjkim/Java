public class StudentBody 
{
    //-----------------------------------------------------------------
    //  Creates some Address and Student objects and prints them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Address school = new Address("800 Lancaster Ave.", "Villanova",
                "PA", 19085);
//        System.out.println(school);
        
        Address jHome = new Address("21 Jump Street", "Blacksburg",
                "VA", 24551);
//        System.out.println(jHome);
        Student john = new Student("John", "Smith", jHome, school);
     
//        Address mHome = new Address("123 Main Street", "Euclid", "OH",
//                44132);
//        
//        Student marsha = new Student("Marsha", "Jones", mHome, school);
//
        System.out.println(john);
//        System.out.println();
//        System.out.println(marsha);
    }
}
