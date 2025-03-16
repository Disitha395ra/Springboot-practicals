/*Create a student class
	-create 5 student objects and store it in 
	a proper datastructure
- find the average marks of the students */
import java.util.*;
class Student{
    String name;
    int marks;

    //creating a constructor
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class exercise6 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kamal", 80));
        students.add(new Student("Namal", 90));
        students.add(new Student("Sunil", 70));
        students.add(new Student("Nimal", 60));
        students.add(new Student("Amal", 50));
    }
}
