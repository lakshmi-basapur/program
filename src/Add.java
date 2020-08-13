import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int n=0;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter second number");
            int b = sc.nextInt();
            int add = a + b;
            System.out.println(add);
            System.out.println("are you wish to perform this again,enter 1   or esle other");
            n=sc.nextInt();

        } while (n<=1);
    }
}
