public class operators {
    public static void main(String[] args) {
        int a = 10;  float b=20.5f;


        //arithmetic operators

        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("b/a=" + (b/a));
        System.out.println("a%b=" + (a % b));



        //relational  operators

        System.out.println("a==b is  " + (a == b));
        System.out.println("a!=b" + (a!=b));
        System.out.println("a<b is  " + (a<b));
        System.out.println("a>b  is  " + (a>b));
        System.out.println("a<=b  is  " + (a<= b));

      //logical operators

        System.out.println("&& is  " +( (a < b)&& (a>b)) );
        System.out.println("|| is  " +( (a < b)|| (a>b)) );
        System.out.println("! is  " + !(a<b));




    }
}
