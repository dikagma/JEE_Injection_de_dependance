package com.cmdb.presentation;

import com.cmdb.dao.DaoImpl;
import com.cmdb.metier.MetierImpl;

public class Presen2Setter {
    public static void main(String[] args) {

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println("Utilisation de setter " + metier.calcul());
    }
}
