package com.cmdb.ext;

import com.cmdb.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2  implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur .....");
        double t=12;
        return t;
    }
}
