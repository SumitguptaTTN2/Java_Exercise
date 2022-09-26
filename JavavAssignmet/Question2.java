//Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline
//public class Question2 {
//    public static void main(String[] args) {
//        String find = "XDone";
//        int i = args[0].indexOf(find);
//        if (i > 0)
//            for (int it = 0; it < i; it++) {
//                System.out.print(args[0].charAt(it));
//            }
//        else
//            System.out.println("Not Found");
//    }
//}

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
String str1="";

        while (!"XDone".equals(str = input.nextLine())) {
            str1+=str+" ";


        }
        System.out.println(str1);
    }

}

