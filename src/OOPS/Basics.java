package OOPS;
class Student{
    String name;
    int roll;
    double cgpa;
    void print(){
        System.out.print(roll + " " + cgpa + " " + name + " ");
    }
}
public class Basics {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ashutosh";
        s.roll = 21;
        s.cgpa = 6.5;
        s.print();
    }
}
