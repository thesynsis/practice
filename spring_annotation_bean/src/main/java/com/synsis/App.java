package com.synsis;

import com.synsis.dao.BookDao;
import com.synsis.dao.UserDao;
import com.synsis.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        UserDao userDao = ctx.getBean(UserDao.class);
        userDao.save();
    }
}
