package com.naveed.springbootcore.cake;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cake {
    Flavor flavor;
    Cream cream;

    Cake(Flavor flavor){
        this.flavor = flavor;
        System.out.println("Cake object Created");
        flavor.getFlavor();
    }

    @Autowired
    public void setCream(Cream cream){
        this.cream = cream;
        cream.getName();
    }
}
