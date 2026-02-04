package week2PracticalTasks.feb4;

public class Student {
    private String name;
    private int rollNo;

    Student (String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void setName(String name){
        this.name = name;
    }
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void getName(){
        System.out.println(name);
    }
    void getRollNo(){
        System.out.println(rollNo);
    }
}


class TestStudent{
    public static void main(String[] args){
//        Student s1 = new Student();
//        System.out.println(s1.name);
//        System.out.println(s1.rollNo);

        Student s2 = new Student("Armit", 101);
        s2.getName();
        s2.getRollNo();
        s2.setName("Sita");
        s2.setRollNo(5);
        s2.getName();
        s2.getRollNo();

        Student s3 = new Student("Swodesh Singh", 23);
        s3.getName();
        s3.getRollNo();

    }
}
