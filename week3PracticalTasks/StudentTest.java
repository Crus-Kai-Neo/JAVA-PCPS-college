
package week3PracticalTasks;

import java.util.Scanner;

class StudentTest {

    String newname;
    int newage;

    StudentTest(String name, int age){
        newname = name;
        newage = age;

    }


    void newdisplay() {
        System.out.println("Name: " + newname);
        System.out.println("Age: " + newage);
    }
}

class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String n = scanner.nextLine();

        System.out.print("Enter the student's age: ");
        int a = scanner.nextInt();

        StudentTest s1 = new StudentTest(n,a);
        s1.newdisplay();

        scanner.close();
    }
}
