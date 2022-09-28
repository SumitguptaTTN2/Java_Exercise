package Assignment_java_Wed;
// 2) Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//        Design the class in such a way that the default sorting should work on firstname and lastname.
//
//        Also, Write a program to sort Employee objects based on salary using Comparator.


import java.util.*;

class FnCompare implements Comparator {
    public int compare(Object e1, Object e2) {
        Employyee s1 = (Employyee) e1;
        Employyee s2 = (Employyee) e2;

        return s1.Fn.compareTo(s2.Fn);
    }

}

class Lncompare implements Comparator {
    public int compare(Object e1, Object e2) {
        Employyee s1 = (Employyee) e1;
        Employyee s2 = (Employyee) e2;

        return s1.Ln.compareTo(s2.Ln);
    }

}

class Salarycompare implements Comparator {
    public int compare(Object o1, Object o2) {
        Employyee e1 = (Employyee) o1;
        Employyee e2 = (Employyee) o2;

        return e1.Salary.compareTo(e2.Salary);
    }

}

class Employyee {
    Double Age;
    Double Salary;
    String Name;
    String Fn;
    String Ln;

    Employyee(Double age, Double salary, String fn, String ln) {
        this.Age = age;
        this.Salary = salary;
        this.Name = fn + " " + ln;
        this.Fn = fn;
        this.Ln = ln;
    }

    @Override
    public String toString() {

        return (Age + " : " + Salary + " : " + Name + " ");
    }

}

public class Question2 {

    public static void main(String[] args) {
        Employyee e1 = new Employyee((double) 22, 2000.90d, "Sumit", "Gupta");
        Employyee e2 = new Employyee((double) 24, 98000.90d, "Puneet", "Katariya");
        Employyee e3 = new Employyee((double) 27, 30000.90d, "Abhi", "Singh");

        List<Employyee> li = new ArrayList<>();
        li.add(e1);
        li.add(e2);
        li.add(e3);
        System.out.println("Print Objects");
        System.out.println(li.toString());
        System.out.println("Fn sorting");
        Collections.sort(li, new FnCompare());
        System.out.println(li.toString());
        System.out.println("Ln sorting");
        Collections.sort(li, new Lncompare());
        System.out.println(li.toString());
        System.out.println("Salary sorting");
        Collections.sort(li, new Salarycompare());
        System.out.println(li.toString());


    }
}
