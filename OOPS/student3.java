import java.util.*;

public class student3 {
    public static class Student {
        int age;
        String name;

        void announceYourself() {
            System.out.println(this.name + "[" + this.age + "] is present.");
        }
    }

    public static void main(String[] args) {
        Student s1; // s1 stores null
        s1 = new Student(); // new will allocate memory in heap, and create objen age and name
        s1.age = 34;
        s1.name = "A";

        Student s2 = new Student();
        s2.age = 10;
        s2.name = "B";

        s1.announceYourself();
        s2.announceYourself();

        swap(s1, s2);

        s1.announceYourself();
        s2.announceYourself();

    }

    public static void swap(Student s1, Student s2) {
        s1 = new Student(); // object is created in memory heap, with initial value of 0 for int data
                            // types,// and null for String
        s2 = new Student();

        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;

        s1.announceYourself();
        s2.announceYourself();
    }
}
