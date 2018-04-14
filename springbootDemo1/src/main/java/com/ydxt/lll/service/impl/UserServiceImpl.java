package com.ydxt.lll.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ydxt.lll.domain.User;
import com.ydxt.lll.mapper.UserDao;
import com.ydxt.lll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<User> getUsersByPage(int startIndex, int pageSize) {
        PageHelper.startPage(startIndex, pageSize);
        List<User> list = userDao.getUsersByPage(startIndex, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User getUserByName(String userName) {
        User user = new User();
        user.setAge(20L);
        user.setName("daming");
        return user;
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
