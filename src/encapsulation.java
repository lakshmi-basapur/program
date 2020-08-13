public class encapsulation {

    public static void main(String [] args)
    {
        Variable  v=new Variable();
        System.out.println("a value  "  +v.getA());
    }
}


class Variable{

    private int a=1500; //assigning a access modifier

    public int getA() {
        return a;
    }
//SETS THE VALUE
    public void setA(int a)
    {
        this.a = a;
    }
}