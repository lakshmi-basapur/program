public class Array1 {
    public static void main(String[] args) {

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


        int c[]=new int[]{ 10,20,50,56};
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }

    }
}
