package com.cmdb.presentation;

import com.cmdb.dao.IDao;
import com.cmdb.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presen2FochierDeConfig {
   public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       Scanner scanner = new Scanner(new File("config.txt"));
       String daoClassName = scanner.nextLine();
       //instantiation dynamique
       Class cDao = Class.forName(daoClassName);

       IDao dao= (IDao) cDao.newInstance(); //si je veux utiliser un constructeur sans parametre


      /* System.out.println( dao.getData());
       System.out.println("test de l'instantiation dynamique  reussi ");*/

       String metierClassName = scanner.nextLine();
       //instantiation dynamique
       Class cMetier = Class.forName(metierClassName);
      // IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao); //Constructeur avec parametre

       IMetier metier= (IMetier) cMetier.getConstructor().newInstance();
       Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
       setDao.invoke(metier,dao);


       System.out.println("Res " + metier.calcul());
       System.out.println("la fermeture a la modification de la couche presentation  en utilisant l'injection par un setter a reussie ");


   }
}
