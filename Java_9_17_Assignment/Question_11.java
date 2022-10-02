package Java_9_17_Assignment;
record Student (String name,Integer id ,Integer age)
{
    static int counter =0;
    static void inc()
    {

    }
    Student
    {
        inc();
    }
}
public class Question_11 {
    public static void main(String[] args) {
        Student st1=new Student("sumit",1,20);
        Student st2=new Student("ravi",1,20);
        System.out.println(st2.equals(st1));
        System.out.println(Student.counter);


    }
}
