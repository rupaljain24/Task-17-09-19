package com.wp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wp.entities.Student;
import com.wp.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("removestudent")
	public ModelAndView deleteStudent(@RequestParam("id") int code){
		studentService.deleteStudent(code);
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;
	}
	
	
	@RequestMapping("updatestudent")
	public ModelAndView updateStudent(@RequestParam("id") int code){
		Student s = studentService.searchStudent(code);
		
		ModelAndView mv=new ModelAndView("updatentry.jsp");
		mv.addObject(s);
		
		return mv;
	}
	
	@RequestMapping("changeDetails")
	public ModelAndView saveUpdatedInfo(@ModelAttribute("student") Student student){
		studentService.changeStudentDetails(student);
		ModelAndView mv=new ModelAndView("index.jsp");
		return mv;
	}
	
	
	
	
	
	
	
	
	@RequestMapping("viewall")
	public ModelAndView showAllRecords(){
		List<Student> students=studentService.viewAllStudents();
		ModelAndView mv=new ModelAndView("studentlist.jsp");
		mv.addObject("students", students);
		return mv;
	}
	
	
	
	@RequestMapping("dataentry")
	public String showDataEntryForm(){
		return "dataentry.jsp";
	}
	
	@RequestMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student){
		studentService.studentEntry(student);
		ModelAndView mv=new ModelAndView("saveconfirm.jsp");
		return mv;
	}
	
	
}

//ModelAndView mv=new ModelAndView("redirect:viewallstudents");