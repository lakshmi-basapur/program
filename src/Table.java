import java.util.Scanner;

public class Table {
    public static void main(String [] args)
    {
        System.out.println("enter a number to print table");
        Scanner m=new Scanner(System.in);
        int n=m.nextInt();
        int s;
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=10;j++)

            {
                s=i*j;
                System.out.println(i+"*"+j+"="+s);

            }


        }


    }
}
