package Java_9_17_Assignment;

class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Created");
    }

    public void Display() {
        System.out.println("Display Called");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Closed");
    }
}

public class Question_8 {
    public static void main(String[] args) throws Exception {
        Resource res = new Resource();
        try (res) {
            res.Display();
        }
    }
}
