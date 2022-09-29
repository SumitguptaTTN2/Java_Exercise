package Java_8;
//collect even in stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee {
    String Name;
    Long Salary;
    String City;

    Employee(String fn, String ln, Long salary, String city) {
        this.Name = fn + ln;
        this.Salary = salary;
        this.City = city;
    }

}

public class Qusetion_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(12, 1, 3, 15, 19, 67, 40).stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

        Employee emp1 = new Employee("sumit", "Gupta", 1000L, "Orai");
        Employee emp2 = new Employee("sam", "Parker", 2000L, "Delhi");
        Employee emp3 = new Employee("puneet", "Katariya", 4000L, "Delhi");
        Employee emp4 = new Employee("puneet", "Katariya", 4000L, "Delhi");
        List<Employee> li = new ArrayList<>();
        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        li.add(emp4);

        System.out.println(li.stream().distinct().filter(e -> (e.Salary < 5000) && (e.City.contains("Delhi"))).map(e -> (e.Name + e.City + e.Salary)).collect(Collectors.toSet()));
    }
}
