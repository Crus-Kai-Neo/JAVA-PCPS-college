package week3PracticalTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Students swodesh = new Students();
//        swodesh.name = "Swodesh";
//        swodesh.grade = 'C';
//        swodesh.update('A');
//
//        System.out.println(swodesh.grade);


//        Product daraz = new Product(001,"guitar",20000.5,1);
//        System.out.println(daraz.stockQuantity);
//        daraz.addStock(20);
//        daraz.purchasingProduct(10);
//        System.out.println(daraz.stockQuantity);
//        daraz.displayProductDetails();

        Employee E1 = new Employee(002,"Swodesh","Manager",50000.00);
        E1.salaryIncrement(500);
        System.out.println(E1.salary);
        E1.employeeDetails();



    }
}
class Students{
    int studentID;
    String name;
    char grade;

    void update(char Character){
        grade = Character;

    }
}

 class Product{
    int productid;
    String name;
    double price;
    int stockQuantity;

    Product(int productid, String name, double price, int stockQuantity){
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void addStock(int Quantity){
        stockQuantity += Quantity;

    }
    void purchasingProduct(int Quantity){
        if (stockQuantity <= Quantity){
            System.out.println("Not sufficient stock to fill the order");
        }
        else{
            stockQuantity -= Quantity;
        }

    }

    void displayProductDetails(){
        System.out.println(productid);
        System.out.println(name);
        System.out.println(price);
        System.out.println(stockQuantity);

    }
}

class Employee{
    int employeeID;
    String name;
    String designation;
    double salary;

    Employee(int employeeID,String name,String designation,double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void salaryIncrement(double amount){
        if (amount < 0){
            System.out.println("negative numbers are invalid");
        }
        else{
            salary += amount;
        }
    }

    void employeeDetails(){
        System.out.println("employee id: " + employeeID);
        System.out.println("name: " + name);
        System.out.println("designation: " + designation);
        System.out.printf("salary: %.2f\n", salary);
    }



}
