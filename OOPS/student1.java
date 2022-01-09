import java.util.*;

public class student1 {

    public static class Student {
        int age;
        String name;

        void announceYourself() {
            System.out.println(this.name + "[" + this.age + "] is present.");
        }
    }

    public static void main(String[] args) {
        Student s1;
        s1 = new Student();
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
        Student temp;
        temp = s1;
        s1 = s2;
        s2 = temp;
    }
}