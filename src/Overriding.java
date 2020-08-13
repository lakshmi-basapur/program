public class Overriding {
   //overriden
    void eat()
    {
        System.out.println("eats spicy food");
    }

    void drink()
    {
        System.out.println("drinks 5ltrs of water daily");
    }
}
class Child extends Overriding{
   //overriding method
    void read()
    {
        System.out.println("read");
    }

    void drink()
    {
        System.out.println("drinks 5ltrs of water daily");
    }
    void eat()
    {
        System.out.println("don't like spicy food");
    }
    public static void main(String[] args)
    {
        Child a =new Child();
        a.drink();
        a.eat();     //this method overrides the parent method
        a.read();    //this is a special character  in a child
    }
}
