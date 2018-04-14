package com.ydxt.lll.controller;

import com.github.pagehelper.PageInfo;
import com.ydxt.lll.domain.User;
import com.ydxt.lll.service.UserService;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/13.
 */
@Api
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation("通过名称获取用户")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", name="name", dataType = "String", required = true, value = "名称")})
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没有填好"),
            @ApiResponse(code = 404, message = "请求异常")
    })
    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)//定义requestMapping rest风格
    @ResponseBody//返回json格式数据
    public User getUserByName(@RequestParam(value="name") String userName){
        return userService.getUserByName(userName);
    }

    @RequestMapping(value = "/getUsersByPage", method = RequestMethod.GET)
    @ResponseBody//返回json格式数据
    protected PageInfo<User> getUsersByPage(int pageSize, int pageNum){
        return userService.getUsersByPage(pageSize, pageNum);
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    @ResponseBody//返回json格式数据
    protected User getUserById(@RequestParam(value="id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    protected int deleteUser(@RequestParam(value="id")  Long id) {
        User user = new User();
        user.setId(id);
        return userService.deleteUser(user);
    }

    @RequestMapping(value="/addUser", method = RequestMethod.POST)
    protected int addUser(@RequestBody User user) {
        if(user.getId()!=null&&user.getId()!=0){
            return userService.updateUser(user);
        }else{
            return userService.addUser(user);
        }
    }
}
