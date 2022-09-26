///Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Question1 {
    static String FirstName = "Sumit";
    static String LastName = "Gupta";
    static int age = 22;

    public static void Function1() {
        age += 10;
        System.out.println("Inside function1");
        System.out.println(FirstName + " " + LastName + " " + (age));

    }

    static {
        System.out.println(FirstName + " " + LastName + " " + (age));
        age += 2;
    }


    public static void main(String[] args) {
        System.out.println(FirstName + " " + LastName + " " + (age));
        Function1();
    }
}
