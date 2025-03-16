package com.cmdb.metier;

import com.cmdb.dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;


    public MetierImpl() {
    }
     /*
     * pour injecter dans l'attribue dao un objet d'une classe qui implement
     * l'interface IDao
     * apres instantiation
     *  */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    /*
     * pour injecter dans l'attribue dao un objet d'une classe qui implement
     * l'interface IDao
        au moment de l'intantiation
     *  */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res= t * 12 * Math.PI/2 * Math.cos(t);
        return  res;
    }
}
