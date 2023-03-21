package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	public List<Student> saveStudents(Student students) {
		
		return repo.saveAll(students);
	}

	public List<Student> getStudents() {
		
		return repo.findAll();
	}

	public Student getStudentById(int id) {
		return repo.findById(id).orElse(null);
	}

	public Student getStudentByName(String name) {
		return repo.findByName(name);
	}

	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "student deleted" + id;
	}
	
	public Student updateStudent(Student student) {
		Student stud = repo.findById(student.getId()).orElse(null);
		stud.setName(student.getName());
		stud.setAge(student.getAge());
		stud.setMobile(student.getMobile());
		return repo.save(stud);
		
	}

	
	
	
	
	

}
