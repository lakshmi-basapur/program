public class ConstructorOverloading {
    ConstructorOverloading()
    {
        System.out.println("without parameter");
    }
    ConstructorOverloading(int a)
    {
        System.out.println("only one parameter");
    }
    ConstructorOverloading(int a,int b)
    {
        System.out.println("2 parameter");
    }

  public static void main(String [] args)
  {
      new ConstructorOverloading();
      new ConstructorOverloading(8);
      new ConstructorOverloading(8,9);
  }



}
