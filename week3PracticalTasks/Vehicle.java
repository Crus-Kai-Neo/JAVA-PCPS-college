package week3PracticalTasks;

public class Vehicle {
    String registrationNumber;
    String ownerName;
    String model;
    int year;

    Vehicle(String registrationNumber,String ownerName,String model,int year){
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.year = year;
    }

    public void changeOwnership(String name){
        ownerName = name;
    }

    public void displayDetails(){
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Owner name: " + ownerName);
        System.out.println("model: " + model);
        System.out.println("year: " +  year);
    }

}

class ExampleVehicle{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("WEewc2323","Swodesh","Porche 911", 2018);
        Vehicle v2 = new Vehicle("CAT5432","Sagar","Tesla S series", 2020);
        v1.displayDetails();
        v2.changeOwnership("Samar");
        v2.displayDetails();
    }
}
