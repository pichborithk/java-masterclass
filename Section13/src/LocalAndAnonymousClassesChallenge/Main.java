package LocalAndAnonymousClassesChallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        var e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        var e3 = new Employee("Daffy", "Duck", "11/02/2011");
        var e4 = new Employee("Daisy", "Duck", "05/03/2013");
        var e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
    }

    public static void printOrderedList(List<Employee> eList, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (var e : eList) {
            list.add(new MyEmployee(e));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearWorked - o2.yearWorked;
            }
        };

        list.sort(comparator);

        for (var e : list) {
            System.out.println(e);
        }
    }
}
