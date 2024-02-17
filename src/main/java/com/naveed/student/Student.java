package com.naveed.student;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Student(){
        System.out.println("\n Student Object Creaated \n");
    }
    
    public void print(){
        System.out.println("\n print method of the Student Class \n");
    }
}
