package com.synsis.dao.impl;

import com.synsis.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class BookDaoiml implements BookDao {
    @Value("${jdbc}")
    private String jdbc;
//    private int connectionNum;
//    private String databaseName;
//
//    public void setConnectionNum(int connectionNum) {
//        this.connectionNum = connectionNum;
//    }
//
//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }
    @Override
    public void save() {
        System.out.println("this is BookDao"+jdbc);
    }
}
