public class Polymorphismmethod
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 25;
        int c = 35;
        float d = 10.3f;
        float e = 19.9f;
        Methodoverloading xyz=new Methodoverloading();
        xyz.add();
        xyz.add(a,b);
        xyz.add(b,e);
    }
}
   class Methodoverloading
   {

       void add(int a,int b)
       {
           System.out.println(a + b);
       }
       void add(float e,int b)
       {
           System.out.println(e + b);
       }

       void add()
       {
           System.out.println("hi");
       }
       void add(int b,float e)
       {
           System.out.println(b + e);
       }
       void add(float e,float d)
       {
           System.out.println(e + d);
       }
   }