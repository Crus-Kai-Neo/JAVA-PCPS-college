package week2PracticalTasks.feb4;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void displayPerson(){
        System.out.println(name);
    }

}

class student extends Person {

    private int rollNo;

    student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void displayStudent(){
        System.out.println("Student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student roll no: " + getRollNo());
    }

    public static void main(String[] args){
        student s1 = new student("Ramesh", 20,15);
        s1.displayStudent();
//        System.out.println(s1.name);
//        System.out.println(s1.age);

        student s2 = new student("Swodesh",18,25);
        s2.displayStudent();
    }

}
