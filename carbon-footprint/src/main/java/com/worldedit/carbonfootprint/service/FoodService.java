package com.worldedit.carbonfootprint.service;

import com.worldedit.carbonfootprint.entity.Food;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-03
 */
public interface FoodService extends IService<Food> {

    void transform(Food food);
}
