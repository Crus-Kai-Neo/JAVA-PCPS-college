package week3PracticalTasks;

class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Ram", 20);
        s1.display();
    }
}
