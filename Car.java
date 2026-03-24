public class Car{
    //car
    double price;
    String color;
    String logo;
    int speed;
    String typeOfFuel;
    public Car(double price, String color, String logo, int speed, String typeOfFuel) {
        this.price = price;
        this.color = color;
        this.logo = logo;
        this.speed = speed;
        this.typeOfFuel = typeOfFuel;
    }
    public void drive (){System.out.println("your car is going!" + price);}
    
}