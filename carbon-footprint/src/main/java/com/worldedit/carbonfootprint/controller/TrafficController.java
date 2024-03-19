package com.worldedit.carbonfootprint.controller;


import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.Traffic;
import com.worldedit.carbonfootprint.mapper.TrafficMapper;
import com.worldedit.carbonfootprint.service.TrafficService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author worldedit
 * @since 2022-05-04
 */
@RestController
@RequestMapping("/traffic")
public class TrafficController {
    @Resource
    private TrafficMapper trafficMapper;
    @Resource
    private TrafficService trafficService;
    //用户添加交通信息
    @PostMapping("/addTraffic")
    public ResponseModel<?> addTraffic(@RequestBody Traffic traffic) {
        trafficService.transform(traffic);
        trafficService.save(traffic);
        return ResponseModel.success(traffic).code(ResultCode.SUCCESS);
    }
    //用户查看交通碳足迹
    @GetMapping("/{id}")
    public Traffic getTrafficById(@PathVariable Integer id){
        return trafficService.getById(id);
    }

}

