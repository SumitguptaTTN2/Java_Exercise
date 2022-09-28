package Assignment_java_Wed;
//4) Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
import java.util.HashMap;
import java.util.Map;

class Employees {
    String Name;
    int Age;
    String Designation;
    int Salary;

    Employees(String name, int age, String designation, int salary) {
        this.Name = name;
        this.Age = age;
        this.Designation = designation;
        this.Salary = salary;
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Employees e1 = new Employees("Sumit ", 22, "SE", 1000);
        Employees e2 = new Employees("Puneet", 23, "SE", 2000);
        Employees e3 = new Employees("Ritik", 24, "QE", 3000);
        Map<Employees, Integer> v = new HashMap<>();
        v.put(e1, e1.Salary);
        v.put(e2, e2.Salary);
        v.put(e3, e3.Salary);

        for (Map.Entry<Employees, Integer> m : v.entrySet()) {
            Employees e = m.getKey();
            System.out.println(m.getKey() + " " + e.Age + " " + e.Name + " " + e.Designation + " : " + m.getValue());
        }
//for(Employees e:v.keySet())
//{
//    System.out.println(e.Age+" "+e.Name+" "+e.Designation+" "+v.get(e));
//}

    }
}
