package com.worldedit.carbonfootprint.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.Clothes;
import com.worldedit.carbonfootprint.entity.User;
import com.worldedit.carbonfootprint.mapper.ClothesMapper;
import com.worldedit.carbonfootprint.service.ClothesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author worldedit
 * @since 2022-05-03
 */
@RestController
@RequestMapping("/clothes")
public class ClothesController {
    @Resource
    private ClothesMapper clothesMapper;
    @Resource
    private ClothesService clothesService;
    //    用户添加衣物信息
    @PostMapping("/addClothes")
    public ResponseModel<?> addClothes(@RequestBody Clothes clothes) {
        clothesService.transform(clothes);
        clothesService.save(clothes);
        return ResponseModel.success(clothes).code(ResultCode.SUCCESS);
    }
    //    查看用户衣物碳足迹
    @GetMapping("/{id}")
    public Clothes getClothesById(@PathVariable Integer id){
        return clothesService.getById(id);
    }


    @PostMapping("/selectClothes/{id}")
    public ResponseModel<?> selectClothes(@PathVariable Integer id) {
        QueryWrapper<Clothes> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("create_id",id);//这是按创建人id查询
        List<Clothes> list = clothesService.list(queryWrapper);
        Clothes clothes = clothesService.getById(id);
        return ResponseModel.success(clothes).code(ResultCode.SUCCESS);
    }

//    删除用户碳足迹
    @DeleteMapping("/delClothes/{id}")
    public boolean delClothes(@PathVariable Integer id) {
        try {
            clothesService.removeById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

