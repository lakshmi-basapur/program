public class Car {

    public String model;
    public String  color;
    int seat;

    public Car()
    {
      model="test model";
      color="black";
      seat=4;
      System.out.println("nice car,eager to drive");

    }
    public Car(String model,String  color,int seat ) {
        this.model = model;
        this.color = color;
        this.seat = seat;
        System.out.println("hi");
    }

    public void  display()
    {
        System.out.println("model is:   "+model);
        System.out.println("color is:   "+color);
        System.out.println("seat is:   "+seat);

    }

    }



