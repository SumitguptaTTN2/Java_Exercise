package Assignment_java_Wed;
//1) Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.


import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> li = new ArrayList<>();
        li.add(2.33f);
        li.add(7.89f);
        li.add(6.33f);
        li.add(8.805f);
        li.add(9.40f);
        li.add(90.89f);
        float sum=0.0f;
        for (float i : li) {
            sum+=i;
            System.out.print (i+" ");
        }
        System.out.println();
        System.out.println("sum of all flaoting numbers " +sum);
    }
}
