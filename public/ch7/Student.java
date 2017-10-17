public class Student
{
    private String firstName, lastName;
    private Address home, school; // objects

    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student(String first, String last, Address home, Address school)
    {
        firstName = first;
        lastName = last;
        this.home = home;
        this.school = school;
    }

    //-----------------------------------------------------------------
    //  Returns a string description of this Student object.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + home + "\n";
        result += "School Address:\n" + school;

        return result;
    }
}
