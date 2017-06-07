package com.github.Serialization_demo;

import com.github.entity.Shoe;
import com.github.manager.ShoeManagerEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-data.xml");
        ShoeManagerEntity shoeManagerEntity = (ShoeManagerEntity) context.getBean(ShoeManagerEntity.class);

        Shoe whiteNikeShoe = new Shoe("Nike", 1000, 9, "WHITE", true);
        System.out.println("Before Serialization");
        System.out.println(whiteNikeShoe.get_brand().toString());
        // serializing shoe object
        System.out.println(whiteNikeShoe.toString());
        shoeManagerEntity.save(whiteNikeShoe);

        // creating another Shoe with different brand
        Shoe blackAdidasShoe = new Shoe("Adidas", 2000, 8, "Black", true);

        // deserializing shoe object
        whiteNikeShoe = shoeManagerEntity.findById(1000);
        System.out.println("After DeSerialization");
        System.out.println(whiteNikeShoe.toString());
    }
}
