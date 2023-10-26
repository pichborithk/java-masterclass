package GenericExtra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }

        printList(students);
        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lpaStudents.add(new LPAStudent());
        }

        printList(lpaStudents);

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printList(matches);

//        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
//        printList(students2021);

//        var students2021 = QueryList.getMatches(new ArrayList<Student>(), "YearStarted", "2021");
//        printList(students2021);

        var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
        printList(students2021);
    }

//    public static <T extends Student> void printList(List<T> students) {
//        for (var student : students) {
//            System.out.println(student);
//        }
//
//        System.out.println();
//    }

    public static  void printList(List<? extends Student> students) {
        for (var student : students) {
            System.out.println(student);
        }

        System.out.println();
    }
}
