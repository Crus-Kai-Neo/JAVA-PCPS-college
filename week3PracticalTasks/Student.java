package week3PracticalTasks;

class Student {

    String name;
    int age;
    String collegeName;

    Student(String n, int a, String c) {
        name = n;
        age = a;
        collegeName = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("You study in " + collegeName);
    }
}

class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Ram", 20, "PCPS");
        s1.display();
        Student s2 = new Student("Swodesh Singh", 18, "TIMES");
        s2.display();
        Student s3 = new Student("himal", 19,"Campion");
        s3.display();
//
//        Student s4 = new Student();
    }
}
