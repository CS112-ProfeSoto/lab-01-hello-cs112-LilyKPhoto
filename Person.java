/**
 * Person.java: Base class for data type representing a person
 * 
 * @author Lily Kaplan <lily.kaplan2102@gmail.com>
 */

public class Person 
{
    private int age; // must be greater than 0

    // default constructor - sets age to 20 if nothing is given.
    public Person()
    {
        this.setAge(20);
    }

    // full constructor - sets age to the age given as a parameter.
    public Person(int age)
    {
        if (!this.setAge(age))
        {
            System.out.println("Error in setting age; must be greater than 0.");
        }
    }
    
    /**
     * This method gets the age of the calling object.
     * @return the age
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * Sets the age of the calling object
     * @param age an integer containing the age.
     * @return true if age>0, otherwise returns false.
     */
    public boolean setAge(int age)
    {
        if (age > 0) {
            this.age = age;
            return true;
        } else {
            System.out.println("Invalid age entered; must be greater than 0.");
            return false;
        }
    }
    
    /**
     * This method checks for equality. 
     * Since there's only one instance variable here, we only need to check if the ages are equal. 
     * Since age is an int, we can use == here.
     * @param other the Person object to check.
     * @return true if the ages match, false if not.
     */
    public boolean equals(Person other)
    {
        return this.getAge() == other.getAge();
    }

    /**
     * This method returns a String representation of the class.
     * 
     * @return a String saying how old the calling Person is.
     */
    @Override
    public String toString()
    {
        return String.format("This person is %d years old.", this.getAge());
    }
}
