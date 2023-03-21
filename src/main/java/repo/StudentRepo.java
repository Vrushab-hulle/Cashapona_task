package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{


	List<Student> saveAll(Student students);

	Student findByName(String name);
	

}
