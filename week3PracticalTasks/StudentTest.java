
package week3PracticalTasks;

import java.util.Scanner;

class StudentTest {
    String name;
    int age;
    StudentTest(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Test {
    public static void main(String[] args) {
        StudentTest s1 = new StudentTest("Swodesh",18);
        s1.display();
    }
}
