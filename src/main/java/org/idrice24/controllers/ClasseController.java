package org.idrice24.controllers;

import java.util.List;

import javax.validation.Valid;

import org.idrice24.entities.Classe;
import org.idrice24.entities.Student;
//import org.idrice24.entities.Student;
import org.idrice24.services.ClasseService;
// org.idrice24.services.OdfService;
import org.idrice24.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClasseController {
    private final ClasseService classeService;
    private StudentService studentService;

    @Autowired
    public ClasseController(ClasseService classeService, StudentService studentService){
        this.classeService = classeService;
        this.studentService = studentService;
    }

    @GetMapping("/classe")
    public String viewPage(Model model){
        Classe classe = new Classe();
        model.addAttribute("classe", classe);
        return "add-classe";
    }

    @GetMapping("/classe/list")
    public String showClasse(@Valid Classe classe, Model model){
        model.addAttribute("classes", classeService.getAllClasse());
        return "classe";
    }

    @PostMapping("/add/classe")
    public String newClasse(@Valid Classe classe, Model model, BindingResult result){
        if(result.hasErrors()){
            return "add-classe";
        }
        classeService.saveClasse(classe);
        model.addAttribute("classes", classeService.getAllClasse() );
        return "redirect:/classe/list";
    }

    @GetMapping("/edit/classe/{id}")
    public String editClasse(@PathVariable("id") Long id, Model model, Classe classe ){
        classe = classeService.getClasseById(id);
        model.addAttribute("classe", classe);
        return "add-classe";
    }

    @GetMapping("update/classe/{id}")
    public String updateClasse(@PathVariable("id") long id, Model model, Classe classe, BindingResult result){
        if(result.hasErrors()){
            classe.setId(id);
            return "classe";
        }
        classeService.saveClasse(classe);
        model.addAttribute("classes", classeService.getAllClasse());
        return "classe";
    }

    @GetMapping("/delete/classe/{id}")
    public String deleteClasse(@PathVariable("id") long id, Model model, Classe classe, BindingResult result){
        classe = classeService.getClasseById(id);
        if(result.hasErrors()){
            classe.setId(id);
            return "classe";
        }
        classeService.deleteClasse(classe);
        model.addAttribute("classes", classeService.getAllClasse());
        return "classe";
    }

    @GetMapping("/view/classe/{id}")
    public String viewClasse(@PathVariable("id") long id, Model model){
        Classe classe = classeService.getClasseById(id);
        String classeName = classe.getClasseName();
        model.addAttribute("classes", classe);
        System.out.println(classeName);
        return "classeview";
    }

    @GetMapping("/view/subject/classe/{id}")
    public String subjectClasse(@PathVariable("id") long id, Model model){
        Classe classes = classeService.getClasseById(id);
    //    Classe c = new Classe();
        model.addAttribute("classes", classes);
       // Class<? extends Classe> s = c.getClass();
        model.addAttribute("students", studentService.listAllStudents());
        return "classeview";
    }

    @GetMapping("/class/list")
    public String getClassList( Model model){
        model.addAttribute("classes", classeService.getAllClasse());
        

        return "classList";
    }

    //Export data to pdf file
    @GetMapping("/class/pdf")
    public ModelAndView exportToPdf(){
        ModelAndView mav = new ModelAndView();
       // mav.setView(new OdfService());
        //read data from DB
        List<Classe> list = (List<Classe>) classeService.getAllClasse();
        mav.addObject(list);
        return mav;
    }
    @GetMapping("/classe/list/{value}")
    public String getClassListView(@RequestParam(name="value") String value, Model model){
        
        
        String classe = value ;
        System.out.println("this is class name "+ classe);
        List<Student> st = studentService.findByClasse(classe);
        /*int num = 0;*/
        int i = 1;
        while((int) st.size() > i){
        
            i = i + 1;
            model.addAttribute("num", i);
        }
        
        model.addAttribute("value", value);
        model.addAttribute("classeList", st);
        return "classListprint";
    }

    

}
