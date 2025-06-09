public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!"); // changed for Lab Part 1

        Main.voidReturningMethod(); // calls the voidReturningMethod method, needed for Part 2
        // setup for the value-returning method:
        int numToBeDoubled = 2;
        int doubledNum = Main.intDoubler(numToBeDoubled);
        System.out.printf("If you double %d, it becomes %d.%n%n", numToBeDoubled, doubledNum);

        // setup for Part 3 //

        // testing default constructor:
        Person someone = new Person(); // tests default constructor
        System.out.println(someone); // tests toString method

        // testing all setters and getters, including full constructor //
        Person lily = new Person(23); // tests full constructor
        System.out.printf("Lily is %d years old.%n", lily.getAge()); // tests getter for age 
        lily.setAge(24); // assuming i had a birthday (also tests setter)
        System.out.print("Let's assume Lily had a birthday. ");
        System.out.println(lily);

        // let's test the equals method:
        if (lily.equals(someone))
        {
            System.out.println("Lily and the other person have the same age.");
        }
        else
        {
           System.out.println("Lily and the other person do NOT have the same age."); 
        }
    }

    /**
     * Description: this method just prints a short little message. 
     * It doesn't really *do* anything.
     */
    public static void voidReturningMethod()
    {
        System.out.println("This method doesn't return anything, it just Does A Thing™.");
    }

    /**
     * Description: this method doubles whatever integer value it's given.
     * 
     * @param num an int to be doubled
     * @return num but doubled
     */
    public static int intDoubler(int num)
    {
        return num * 2;
    }
}