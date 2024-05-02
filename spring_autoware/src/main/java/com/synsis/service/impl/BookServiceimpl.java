package com.synsis.service.impl;

import com.synsis.dao.BookDao;
import com.synsis.dao.UserDao;
import com.synsis.service.BookService;

public class BookServiceimpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("this is BookService");
        bookDao.save();
        userDao.save();
    }
}
