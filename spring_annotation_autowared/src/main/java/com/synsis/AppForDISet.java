package com.synsis;

import com.synsis.Config.SpringConfig;
import com.synsis.dao.BookDao;
import com.synsis.dao.UserDao;
import com.synsis.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
//        UserDao userDao = ctx.getBean(UserDao.class);
//        userDao.save();
        BookService bookService = (BookService) ctx.getBean(BookService.class);
        bookService.save();
    }
}
