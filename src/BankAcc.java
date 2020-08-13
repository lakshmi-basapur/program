import java.util.Scanner;


public class BankAcc {
    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("hello");
        System.out.println("How old are you");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("age is " + age);
        if (age > 21 && age < 55) {
            System.out.println("Tell your name");
            String name = sc.next();

            System.out.println(name + "  your savings account  is created");

        } else if (age > 55) {
            System.out.println("Tell your name");
            String name = sc.next();

            System.out.println(name + "  your senior citizen account is created");

        } else {
            System.out.println("Tell your name");
            String name = sc.next();
            System.out.println("ineligible");
        }

    }
}
