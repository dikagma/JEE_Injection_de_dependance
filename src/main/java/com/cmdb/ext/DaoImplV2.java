package com.cmdb.ext;

import com.cmdb.dao.IDao;

public class DaoImplV2  implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur .....");
        double t=12;
        return t;
    }
}
