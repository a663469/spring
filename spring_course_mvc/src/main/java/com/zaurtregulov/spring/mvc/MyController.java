package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/emp")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-details-view";
//    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        Employee emp = new Employee();
        emp.setName("Sabr");
        emp.setSurname("Ivanov");
        emp.setSalary(10);
        model.addAttribute("employee", emp);
        return "ask-emp-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - instructor");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
//        String name = emp.getName();
//        emp.setName("Mr " + name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 10);

//        return "show-emp-details-view";
    }
}
