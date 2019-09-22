package com.wp.services;
import java.util.List;
import com.wp.entities.Student;

public interface StudentService {
	public void studentEntry(Student student);
	public void deleteStudent(int code); 
	public void changeStudentDetails(Student student);
	public Student searchStudent(int code);
	public List<Student> viewAllStudents();
}