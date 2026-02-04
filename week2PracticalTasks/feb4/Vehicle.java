package week2PracticalTasks.feb4;

public class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
    public void displayVehicle(){
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle{
    private int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void displayCar(){
        System.out.println("Car brand: " + getBrand());
        System.out.println("Car speed: " + getSpeed());
        System.out.println("No of doors: " + getNumberOfDoors());
    }

    public static void main(String[] args){
        Car c1 = new Car("Toyota",120,4);
        c1.displayCar();

        System.out.println(c1.getBrand());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getNumberOfDoors());

//        c1.speed = 20;

        Car c2 = new Car("Ferrari", 90,2);
        c2.displayCar();
    }
}
