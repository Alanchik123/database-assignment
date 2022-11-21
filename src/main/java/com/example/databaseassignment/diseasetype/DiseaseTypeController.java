package com.example.databaseassignment.diseasetype;

import com.example.databaseassignment.student.Student;
import com.example.databaseassignment.student.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiseaseTypeController {

    private DiseaseTypeService diseaseTypeService;

    public DiseaseTypeController(DiseaseTypeService diseaseTypeService) {
        this.diseaseTypeService = diseaseTypeService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/diseaseTypes")
    public String listDiseaseTypes(Model model) {
        model.addAttribute("diseaseTypes", diseaseTypeService.getAllDiseaseTypes());
        return "diseaseType";
    }
    @GetMapping("/diseaseTypes/new")
    public String createDiseaseTypeForm(Model model) {
        //attribute Name student on 26 line is provided for 18 line create_student controller in object section
        //firstname os the student class below is equal to a first name in create_student.html on 24 line firstname
        DiseaseType diseaseType=new DiseaseType();
        model.addAttribute("diseaseType",diseaseType);
        return "create_diseaseType";
    }
    //this method redirects to the first getmapping method above
    @PostMapping("/diseaseTypes")
    public String saveDiseaseType(@ModelAttribute("diseaseType") DiseaseType diseaseType) {
        diseaseTypeService.saveDiseaseType(diseaseType);
        return "redirect:/diseaseTypes";
    }

    @GetMapping("/diseaseTypes/edit/{id}")
    public String editDiseaseTypeForm(@PathVariable Long id, Model model) {
        model.addAttribute("diseaseType",diseaseTypeService.getDiseaseTypeById(id));
        return "edit_diseaseType";
    }

    @PostMapping("/diseaseTypes/{id}")
    public String updateDiseaseType(@PathVariable Long id,@ModelAttribute("diseaseType") DiseaseType diseaseType, Model model){
        DiseaseType exisitngDiseaseType=diseaseTypeService.getDiseaseTypeById(id);
        exisitngDiseaseType.setId(id);
        exisitngDiseaseType.setId(diseaseType.getId());
        exisitngDiseaseType.setCname(diseaseType.getCname());

        diseaseTypeService.updateDiseaseType(exisitngDiseaseType);
        return "redirect:/diseaseTypes";
    }

    @GetMapping("/diseaseTypes/{id}")
    public String deleteStudent(@PathVariable Long id) {
        diseaseTypeService.deleteDiseaseTypeById(id);
        return "redirect:/diseaseTypes";
    }
}
