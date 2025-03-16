package com.cmdb.presentation;

import com.cmdb.dao.DaoImpl;
import com.cmdb.metier.MetierImpl;

public class Presen1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
