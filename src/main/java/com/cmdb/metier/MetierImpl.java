package com.cmdb.metier;

import com.cmdb.dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        return 450.987654 * t;
    }
}
