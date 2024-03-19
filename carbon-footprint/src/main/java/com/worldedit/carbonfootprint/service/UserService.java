package com.worldedit.carbonfootprint.service;

import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-01
 */
public interface UserService extends IService<User> {

    ResponseModel<User> login(User user);
}
