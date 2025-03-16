package com.cmdb.presentation;

import com.cmdb.dao.DaoImpl;
import com.cmdb.ext.DaoImplV2;
import com.cmdb.metier.MetierImpl;

public class Presen1 {
    public static void main(String[] args) {

        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
