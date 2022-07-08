package baithuchanh1;

import baithuchanh1.Student;

public class teststaticmethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "nam1");
        Student s2 = new Student(222, "namdz");
        s1.display();
        s2.display();

    }
}
