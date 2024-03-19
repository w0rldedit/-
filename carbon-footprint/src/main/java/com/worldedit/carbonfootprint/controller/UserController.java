package com.worldedit.carbonfootprint.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.User;
import com.worldedit.carbonfootprint.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author worldedit
 * @since 2022-05-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

//     登录
    @PostMapping("/login")
    public ResponseModel<User> login(@RequestBody User user){
        return userService.login(user);
    }
//     注册
    @PostMapping("/regUser")
    public ResponseModel<?> addUserInfo(@RequestBody User user) {
        if (StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())) {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("username",user.getUsername());
            List<User> list = userService.list(queryWrapper);
            if (list.size() > 0) {
                return ResponseModel.failure("用户已存在！").code(ResultCode.ERROR);
            } else{
                userService.save(user);
                return ResponseModel.success("注册成功！").code(ResultCode.SUCCESS);
            }
        } else {
            return ResponseModel.failure("用户名和密码不能为空").code(ResultCode.ERROR);
        }
    }
//     查看用户信息
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }

}

