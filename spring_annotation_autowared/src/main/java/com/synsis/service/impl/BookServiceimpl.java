package com.synsis.service.impl;

import com.synsis.dao.BookDao;
import com.synsis.dao.UserDao;
import com.synsis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceimpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
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
