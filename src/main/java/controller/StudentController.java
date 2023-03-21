package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody Student students) {
		return service.saveStudents(students);

	}

	@GetMapping("/students")
	public List<Student> findAllStudent() {
		return service.getStudents();
	}

	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}

	@GetMapping("/student/{name}")
	public Student findStudentByName(@PathVariable String name) {
		return service.getStudentByName(name);
	}

	@PostMapping("/update")

	public Student updateStudent(@PathVariable Student student) {
		return service.updateStudent(student);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(int id) {
		return service.deleteStudent(id);
	}

}
