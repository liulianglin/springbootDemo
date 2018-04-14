package com.ydxt.lll.mapper;

import com.ydxt.lll.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/13.
 */
@Mapper
public interface UserDao {
    List<User> getUsersByPage(@Param("startIndex")int startIndex , @Param("pageSize")int pageSize);
    User getUserById(Long id);
    int  updateUser(User user);
    int  deleteUser(User user);
    int  addUser(User user);
}
