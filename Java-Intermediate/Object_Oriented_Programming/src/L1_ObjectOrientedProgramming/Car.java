package L1_ObjectOrientedProgramming;

public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFloatInLiters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("Static block called!");
    }

    {
        noOfCarsSold += 1;
        System.out.println("Init block called!");
    }



    Car(String color) {
        System.out.println("Constructor is called");
        this.color = color;
        this.noOfWheels = 4;
        this.maxSpeed = 150;
        this.currentFloatInLiters = 2;
        this.noOfSeats = 5;

    }

    // same above can be replaced as
    Car() {
        this("Black");
        currentFloatInLiters = 5;
    }

//    Car() {
//        this.color = "Black";
//        this.noOfWheels = 4;
//        this.maxSpeed = 150;
//        this.currentFloatInLiters = 2;
//        this.noOfSeats = 5;
//
//    }



    public Car start() {
        if (currentFloatInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFloatInLiters < 5) {
            System.out.println("Car is in reserve mode, please refuel");
        } else {
            System.out.println("Car is started...bruhhhh...");
        }

        return this;

    }

    public void drive() {
        currentFloatInLiters -= 1;
        System.out.println("Car is driving...");

    }

    public void addFuel(float currentFloatInLiters) {
        this.currentFloatInLiters += currentFloatInLiters;
    }

    public float getCurrentFloatInLiters() {
        return this.currentFloatInLiters;
    }
}
