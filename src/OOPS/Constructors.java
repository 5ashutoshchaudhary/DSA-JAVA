package OOPS;
class student{
    String name;
    int roll;
    double cgpa;
        student(String name, int roll, double cgpa){
            this.name = name;
            this.roll = roll;
            this.cgpa = cgpa;
        }
        void print(){
            System.out.println(name+" "+roll+" "+cgpa+" ");
        }
}
public class Constructors {
    public static void main(String[] args) {
        student s = new student("Ashutosh",21,6.5);
        s.print();
    }
}
