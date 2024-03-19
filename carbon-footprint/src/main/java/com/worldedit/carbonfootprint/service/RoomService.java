package com.worldedit.carbonfootprint.service;

import com.worldedit.carbonfootprint.entity.Room;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-05
 */
public interface RoomService extends IService<Room> {

    void transform(Room room);
}
