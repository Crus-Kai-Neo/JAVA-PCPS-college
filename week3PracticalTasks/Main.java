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

        OnlineShoppingCart daraz = new OnlineShoppingCart(001,"guitar",20000.5,1);
        System.out.println(daraz.name);



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

class OnlineShoppingCart{
    int productid;
    String name;
    double price;
    int stockQuantity;

    OnlineShoppingCart(int productid, String name, double price, int stockQuantity){
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
