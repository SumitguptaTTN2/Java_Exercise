package Java_8;

import Assignment_java_Wed.Question2;
import Assignment_java_Wed.Question_3;

import java.util.function.BiFunction;

// Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created
public class Question_2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return b - a;
    }


    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> ad = Question_2::add;
        System.out.println(ad.apply(2, 3));
        BiFunction<Integer, Integer, Integer> sub = Question_2::subtract;
        System.out.println(sub.apply(4, 7));


    }
}
