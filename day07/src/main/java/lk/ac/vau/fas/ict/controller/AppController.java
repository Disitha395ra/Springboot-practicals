package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {
	Student s1 = new Student("2020ICT121","Joe",29,"IT",2.82);
	Student s2 = new Student("2020ICT43","Manuka",24,"IT",3.86);
	Student s3 = new Student("2020CS08","Palavi",22,"AMC",3.1);
	Student s4 = new Student("2020ICT32","Amal",25,"IT",3.34);
	Student s5 = new Student("2020ICT91","Vasantha",24,"ICT",3.25);
	
	private static List<Student> students = new ArrayList<Student>();
	private Map<String,Student> mstudents = new HashMap<String,Student>();
	
	
	public AppController()
	{
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		mstudents.put(s1.getRegNo(),s1);
		mstudents.put(s2.getRegNo(),s2);
		mstudents.put(s3.getRegNo(),s3);
		mstudents.put(s4.getRegNo(),s4);
		mstudents.put(s5.getRegNo(),s5);
		
		
	}
	@GetMapping("/msg")
	public String Mymessage() {
		return "Hello Spring Boot!";
	}
	
	@GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag") int age)
	{
		return "My Age is " +age;
	}
    
	
	@GetMapping("/student")
	public Student getStudent()
	{
		return s1;
	}
	
	@GetMapping("/students")
	public Map<String,Student> getStudents()
	{
		return mstudents;
	}
	@GetMapping("/students/{regNo}")
	public Student getStudentsReg(@PathVariable("regNo") String regNo )
	{
//		for(Student s :students)
//		{
//			if(s.getRegNo().equals(regNo) )
//			{
//				 return s;
//			}
//		}
//		return null;
		
		return mstudents.get(regNo);  
	}
	@PostMapping("/add")
	public String addstudent(@RequestBody Student student)
	{
		mstudents.put(student.getRegNo(), student);
		return "New Student added";
		
	}
	
	@DeleteMapping("/students/{id}")
	public String DeleteStudent(@PathVariable("id") String regno)
	{
		if(mstudents.get(regno) != null)
		{
			mstudents.remove(regno);
			return "The Student removed";
		}
		return "404 couldn't find the student";
	}
	
	@PutMapping("/students/{id}")
	public String UpdateStudent(@PathVariable("id") String regNo,@RequestBody Student student)
	{
		if(mstudents.get(regNo) != null)
		{
			mstudents.put(student.getRegNo(), student);
			return "The Student Details are Updated";
		}
		return "404 couldn't find the student";
	}
	
	@GetMapping("/findage")
public List<Student> getStudentByAge(@RequestParam int age) {
    List<Student> result = new ArrayList<>();
    for (Student s : mstudents.values()) {
        if (s.getAge() == age) {
            result.add(s);
        }
    }
    return result;
}
}
