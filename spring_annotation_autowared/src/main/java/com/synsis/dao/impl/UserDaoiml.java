package com.synsis.dao.impl;

import com.synsis.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoiml implements UserDao {


    @Override
    public void save() {
        System.out.println("this is UserDao");
    }
}
