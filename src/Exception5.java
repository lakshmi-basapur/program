//nonmatching type


public class Exception5 {
    public static void main(String[] args) {
        try{
            System.out.println("goodmorning");
            System.out.println("hi");
            System.out.println(10/0);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("problem resolved");

        }
        System.out.println("out of loop");
    }
}
