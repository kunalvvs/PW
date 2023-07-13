// import java.io.*;
// import java.util.*;
// import java.lang.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         // int ID[];
//         // String name[];
//         // float cgpa[];
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i=0; i<n;i++)
//         {
//             // int ID = sc.nextInt();
//             // for(i=0; i<n;i++){
//             // String name = sc.nextLine();}
//             // for(i=0; i<n;i++){
//             // float cgpa = sc.nextFloat();}
//             int ID[] = new int[45];
//             ID[i] = sc.nextInt();
//             String name[] = new String[45];
//             name[i] = sc.nextLine();
//             float cgpa[] = new float[45];
//             cgpa[i] = sc.nextFloat();

//            System.out.println(cgpa[i]);
//         }
//     }
// }



import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Student other) {
        if (this.cgpa != other.cgpa) {
            // Sort by CGPA in descending order
            return Double.compare(other.cgpa, this.cgpa);
        } else if (!this.firstName.equals(other.firstName)) {
            // Sort by first name in alphabetical order
            return this.firstName.compareTo(other.firstName);
        } else {
            // Sort by ID in ascending order
            return Integer.compare(this.id, other.id);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = scanner.nextInt();
        Student[] students = new Student[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            students[i] = new Student(id, firstName, cgpa);
        }

        // Sort the students
        Arrays.sort(students);

        // Print the first name of each student
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }
    }
}
