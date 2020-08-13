import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Exception2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw=new PrintWriter("Java.txt");
            }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
