package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // Wrapper Types (wrapper classes for all 8 primitive types)
        // Pre-defined class: String, BigInteger, BigDecimal etc.
        // Custom-Defined class: student, Car, Book and many more

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(34);
        numbers.add(23);
        numbers.add(12);
        numbers.add(45);
        numbers.add(90);
        numbers.add(22);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, (o1, o2) -> -Integer.compare(o1, o2));
        System.out.println(numbers);

        ArrayList <Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(1, 30.5));
        studentArrayList.add(new Student(2, 45.3));
        studentArrayList.add(new Student(3, 23.9));
        studentArrayList.add(new Student(4, 34.89));

        System.out.println(studentArrayList);
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
    }
}

class Student implements Comparable<Student>{
    private int rollNumber;
    private double marks;

    public Student(int rollNumber, double marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("(R: %d, M: %.2f)", rollNumber, marks);
    }

    @Override
    public int compareTo(Student o) {
        return -Double.compare(this.marks, o.marks);
    }
}
