
package week3PracticalTasks;

class StudentTest {

    String newname;
    int newage;


    void newdisplay() {
        System.out.println("Name: " + newname);
        System.out.println("Age: " + newage);
    }
}

class Testing {
    public static void main(String[] args) {

        StudentTest s1 = new StudentTest();
        s1.newname = "ram";
        s1.newage = 20;
        s1.newdisplay();
    }
}
