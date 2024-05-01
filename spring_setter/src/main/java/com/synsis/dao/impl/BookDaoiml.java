package com.synsis.dao.impl;

import com.synsis.dao.BookDao;

public class BookDaoiml implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    @Override
    public void save() {
        System.out.println("this is BookDao"+databaseName+","+connectionNum);
    }
}
