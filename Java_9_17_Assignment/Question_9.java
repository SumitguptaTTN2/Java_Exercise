package Java_9_17_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_9 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li.stream().filter(e -> e > 1).collect(Collectors.toUnmodifiableList()));

    }
}
