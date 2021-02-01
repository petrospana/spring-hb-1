package gr.hua.dit.ds.hb1.controller;

import gr.hua.dit.ds.hb1.dao.StudentDAO;
import gr.hua.dit.ds.hb1.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/add")
    public String addStudent() {
        return "student-form";
        
        
    }
    @GetMapping("/list")
    public String listStudents(Model model) {
        	
     // get customers from dao
        List<Student> students = studentDAO.getStudents();
        
        // add the customers to the model
        model.addAttribute("students",students);
        
        return "listAllStudents";
    }

}