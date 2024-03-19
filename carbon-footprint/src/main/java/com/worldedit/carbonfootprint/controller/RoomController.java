package com.worldedit.carbonfootprint.controller;


import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.Clothes;
import com.worldedit.carbonfootprint.entity.Room;
import com.worldedit.carbonfootprint.service.RoomService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author worldedit
 * @since 2022-05-05
 */
@RestController
@RequestMapping("/room")
public class RoomController {
    @Resource
    private RoomService roomService;

    @PostMapping("/addRoom")
    public ResponseModel<?> addRoom(@RequestBody Room room) {
        roomService.transform(room);
        roomService.save(room);
        return ResponseModel.success(room).code(ResultCode.SUCCESS);
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Integer id){
        return roomService.getById(id);
    }

}

