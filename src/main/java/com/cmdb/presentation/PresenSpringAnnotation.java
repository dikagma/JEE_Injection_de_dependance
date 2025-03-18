package com.cmdb.presentation;

import com.cmdb.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresenSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.cmdb.ext","com.cmdb.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES" + metier.calcul());
        System.out.println("Test version spring annotation reussie");
    }


}
