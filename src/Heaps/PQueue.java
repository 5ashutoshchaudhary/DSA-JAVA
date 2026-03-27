package Heaps;
import java.util.*;
public class PQueue {
    static class Student implements Comparable<Student>{
        String name;
        int marks;

        Student(String name,int marks){
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student s2){
            return this.marks - s2.marks;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Ashutosh" , 99));
        pq.add(new Student("Harshit" , 100));
        while(!pq.isEmpty()){
            Student s = pq.poll();
            System.out.println("Student : " + s.name + ", Marks : " + s.marks);
        }
    }
}
