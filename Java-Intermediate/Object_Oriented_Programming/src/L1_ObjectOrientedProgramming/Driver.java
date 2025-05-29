package L1_ObjectOrientedProgramming;

public class Driver {
    String name;
    int age;
    static int minAgeForDriving = 18;
    String dateOfBirth;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFloatInLiters());
        Car swift = new Car();
        Car thar = new Car("red");
//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);
        thar.start().drive();
        System.out.println(thar.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2024";

    }
}
