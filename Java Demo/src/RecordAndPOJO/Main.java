package RecordAndPOJO;

public class Main {

    public static void main(String[] args) {
        Student pojoStudent = new Student("1", "Ann", "05/11/1990", "Java Masterclass");
        UdemyStudent recordStudent = new UdemyStudent("2", "Bill", "01/01/1994", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());

        pojoStudent.setClassList("Java 15");
        System.out.println(pojoStudent.getClassList());
//        Record field is immutable
    }
}
