package com.naveed.springbootcore.cake;

import org.springframework.stereotype.Component;

@Component
public class Cream {
    Cream(){
        System.out.println("\nCream object created");
    }

    public void getName(){
        System.out.println("Chocolate Cream");
    }
    
}
