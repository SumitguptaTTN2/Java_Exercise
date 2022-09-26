//Write a java program to show following menu to the user:
//
//        *******Menu*******
//        1. Calculate Area of Circle
//        2. Calculate Circumference of a Circle
//        3. Exit.
//        Choose an option (1-3):
//
//        Take radius as user input.


import java.util.Scanner;

public class Question3 {
    public static void Area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        Double area = Math.PI * r * r;
        System.out.println("Area of Circle :" + area);

    }

    public static void Circum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        Double circum = (2 * Math.PI * r);
        System.out.println("Circum of Circle  " + circum);

    }

    public static void main(String[] args) {
        System.out.println("*******Menu*******" + "\n" +
                "1. Calculate Area of Circle" + "\n" +
                "2. Calculate Circumference of a Circle" + "\n" +
                "3. Exit." + "\n" +
                "Choose an option (1-3):");


        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        switch (inp) {

            case 1:
                Area();
                break;
            case 2:
                Circum();
                break;
            case 3: {
                System.out.println("Bye");
                System.exit(0);
            }
            default:
                System.out.println("Not Found");

        }
    }
}