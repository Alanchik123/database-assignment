package com.example.databaseassignment.student;
import com.example.databaseassignment.student.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        //attribute Name student on 26 line is provided for 18 line create_student controller in object section
        //firstname os the student class below is equal to a first name in create_student.html on 24 line firstname
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    //this method redirects to the first getmapping method above
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
            studentService.saveStudent(student);
            return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student, Model model){
        Student exisitngStudent=studentService.getStudentById(id);
        exisitngStudent.setId(id);
        exisitngStudent.setFirstName(student.getFirstName());
        exisitngStudent.setLastName(student.getLastName());
        exisitngStudent.setEmail(student.getEmail());

        studentService.updateStudent(exisitngStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}