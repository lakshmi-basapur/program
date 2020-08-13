import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args)
    {
        //initialize using subscript

                //declare element
                int a[];
                //allocate memory
                a=new int[6];
                //initialize memory
                a[0]=11;
                a[1]=21;
                a[2]=31;
                a[3]=41;
                a[4]=51;
                a[5]=61;
                //print the values
                for(int i=0;i<a.length;i++)
                {
                    System.out.println(a[i]);
                }

     //initialize using one statement during creation
                int c[]=new int[]{ 10,20,50,56};
                for(int i=0;i<c.length;i++)
                {
                    System.out.println(c[i]);
                }

      //using arrayfill method
        int d[]  = new int[5];
               Arrays.fill(d,33);
        for(int i=0; i<d.length; i++)
        {
            System.out.println("value is :  " + d[i]);
        }

        //using for loop
        int e[]=new int[5];
        for(int i=0; i<e.length; i++)
            e[i]=i+3;
        for(int i=0; i<e.length; i++)
        {
            System.out.println("using for loop value is :  " + e[i]);
        }

        //taking user input
        int b[]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        for(int i=0; i<b.length; i++)
        b[i]=sc.nextInt();
        for(int i=0; i<e.length; i++)
        {

            System.out.println("taking user value is :  " +b[i]);
        }




    }
}
