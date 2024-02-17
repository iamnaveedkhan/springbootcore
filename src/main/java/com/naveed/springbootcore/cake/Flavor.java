package com.naveed.springbootcore.cake;


import org.springframework.stereotype.Component;

@Component
public class Flavor {
    Flavor(){
        System.out.println("\nFlavor object Created\n");
    }

    public void getFlavor(){
        System.out.println("Pineapple Flavor");
    }
}
