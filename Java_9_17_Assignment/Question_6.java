package Java_9_17_Assignment;


import java.util.Arrays;
import java.util.List;

public class Question_6 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(integer -> integer>6).findFirst().stream();
    }
}
