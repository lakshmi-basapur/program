import java.util.Scanner;


public class Factorial {

    public static void main(String [] args)
    {
        int  f=1;
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            f=f * i;
            i++;
        }

        System.out.println(f);
    }
}
