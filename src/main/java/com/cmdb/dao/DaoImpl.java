package com.cmdb.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnees ");
        double t=34;
        return t;
    }
}
