package com.worldedit.carbonfootprint.controller;


import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.Food;
import com.worldedit.carbonfootprint.mapper.FoodMapper;
import com.worldedit.carbonfootprint.service.FoodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author worldedit
 * @since 2022-05-03
 */
@RestController
@RequestMapping("/food")
public class FoodController {
    @Resource
    private FoodMapper foodMapper;
    @Resource
    private FoodService foodService;

    //    用户添加食物信息
    @PostMapping("/addFood")
    public ResponseModel<?> addFood(@RequestBody Food food) {
        foodService.transform(food);
        foodService.save(food);
        return ResponseModel.success(food).code(ResultCode.SUCCESS);
    }
    //用户查看食物碳足迹
    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Integer id){
        return foodService.getById(id);
    }

}

