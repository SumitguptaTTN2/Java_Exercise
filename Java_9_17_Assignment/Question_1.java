package Java_9_17_Assignment;


public class Question_1 {
    interface PrivateMethods {
        private static String  Display_rev(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        static String Tolower(String str)
        {
            return Display_rev(str).toLowerCase();
        }
        static String ToUpper(String str)
        {
            return Display_rev(str).toUpperCase();
        }
    }
    public static void main(String[] args) {
        System.out.println(PrivateMethods.Tolower("Sumit"));
        System.out.println(PrivateMethods.ToUpper("Gupta"));

    }
}
