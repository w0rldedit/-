package com.worldedit.carbonfootprint.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.User;
import com.worldedit.carbonfootprint.mapper.UserMapper;
import com.worldedit.carbonfootprint.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public ResponseModel<User> login(User user){
        if(StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())){
            return ResponseModel.failure("账号密码不能为空").code(ResultCode.ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",user.getUsername());
        queryWrapper.eq("password",user.getPassword());
        User user1 = this.getOne(queryWrapper);
        if(user.getPassword().equals(user1.getPassword())){
            String userJson = JSONObject.toJSONString(user1);
            return ResponseModel.success(user1).code(ResultCode.SUCCESS);
        }
        return ResponseModel.failure("登录失败").code(ResultCode.ERROR);
    }

}
