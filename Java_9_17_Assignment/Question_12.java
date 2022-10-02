package Java_9_17_Assignment;

sealed class Base permits Child1, Child2 {

}

final class Child1 extends Base {

}

sealed class Child2 extends Base permits Child3 {

}

non-sealed class Child3 extends Child2 {

};

public class Question_12 {
    public static void main(String[] args) {

    }
}
