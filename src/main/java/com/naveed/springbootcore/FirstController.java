package com.naveed.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naveed.student.Student;


@Controller
public class FirstController {

    @Autowired
    Student s;

    @Autowired
    Employee e;

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        s.print();
        e.getSalaary();
        return "homepage.html";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about method called");
        return "aboutus.html";
    }
}
