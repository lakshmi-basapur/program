public class Exception8 {

    public static void main(String[] args) {



        try{
            System.out.println("good morning");
            System.out.println("hi");
            System.out.println(10/0);

        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());

        }
        System.out.println("out of loop");
    }
}



