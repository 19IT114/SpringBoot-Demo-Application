package Controller;

import Repository.CourseRepository;
import Repository.EmployeeRepo;
import entity.Course;
import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    CourseRepository courseRepository;
    EmployeeRepo ero;
    @Autowired
    private CourseRepository repo;

    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return ero.findAll();
    }

}
