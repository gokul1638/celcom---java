package com.example.student_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public String saveStudent(Student s) {
    	if ((s.getName()== null) || (s.getAge() <= 0)) {
    		return "Please enter the values in all the fields";
    	}
    	else {
    		Student result= repo.save(s);
    		if (result.getId()!= null) {
    			return "Student added successfully \n the id if the student is "+result.getId() ;
    		}
    		else {
    			return "Values not inserted due to an error";
    		}
    		
    	} 
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudent(Long id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteStudent(Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
    
    public Student updateStudent(Long id, Student newData) {
        Student existing = repo.findById(id).orElse(null);

        if (existing == null) {
            return null;  // later we will handle this with exceptions
        }

        existing.setName(newData.getName());
        existing.setAge(newData.getAge());

        return repo.save(existing);
    }

}
