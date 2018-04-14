package com.ydxt.lll.service;

import com.github.pagehelper.PageInfo;
import com.ydxt.lll.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/13.
 */
public interface UserService {
    PageInfo<User> getUsersByPage(int startIndex , int pageSize);
    User getUserById(Long id);
    User getUserByName(String userName);
    int  updateUser(User user);
    int  deleteUser(User user);
    int  addUser(User user);
}
