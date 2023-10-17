package InteritanceChallenge;

public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1990", "01/11/2023");
        SalariedEmployee bo = new SalariedEmployee("Bo", "11/26/1989", "01/12/2023", 50000);

        System.out.println(tim);
        System.out.println(bo);

        System.out.println("Bo's Paycheck = $" + bo.collectPay());

        bo.retire("01/12/2024");
        System.out.println("Bo's Paycheck = $" + bo.collectPay());
        System.out.println(bo);

    }
}
