package com.worldedit.carbonfootprint.service.impl;

import com.worldedit.carbonfootprint.entity.Food;
import com.worldedit.carbonfootprint.mapper.FoodMapper;
import com.worldedit.carbonfootprint.service.FoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-03
 */




@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {
    //    食物碳足迹转换函数
    @Override
    public void transform(Food food){
//      米饭
        float a1 = food.getRiceAmount();
        double b1 = a1 * 1.37 * 0.001;
        food.setRiceCarbon(b1);
//      谷物
        float a2 = food.getGrainsAmount();
        double b2 = a2 * 27.0 * 0.001;
        food.setGrainsCarbon(b2);
//      豆类
        float a3 = food.getPulsesAmount();
        double b3 = a3 * 8 * 0.001;
        food.setPlusesCarbon(b3);
//      鱼类
        float a4 = food.getFishAmount();
        double b4 = a4 * 4.41 * 0.001;
        food.setFishCarbon(b4);

        float a5 = food.getBeefAmount();
        double b5 = a5 * 29.78 * 0.001;
        food.setBeefCarbon(b5);

        float a6 = food.getMuttonAmount();
        double b6 = a6 * 24.37 * 0.001;
        food.setMuttonCarbon(b6);

        float a7 = food.getPorkAmount();
        double b7 = a7 * 4.66 * 0.001;
        food.setPorkCarbon(b1);

        float a8 = food.getChickenAmount();
        double b8 = a8 * 11.37 * 0.001;
        food.setChickenCarbon(b8);
//      各种茶叶平均碳排放
        float a9 = food.getTeaAmount();
        double b9 = a9 * 10.78 * 0.001;
        food.setTeaCarbon(b9);

        float a10 = food.getEggsAmount();
        double b10 = a10 * 3.55 * 0.001;
        food.setEggsCarbon(b10);

        float a11 = food.getOilAmount();
        double b11 = a11 * 1.77 * 0.001;
        food.setOilCarbon(b11);

        float a12 = food.getVegetablesAmount();
        double b12 = a12 * 0.33 * 0.001;
        food.setVegetablesCarbon(b12);
// 各类水果平均
        float a13 = food.getFruitAmount();
        double b13 = a13 * 0.427 * 0.001;
        food.setFruitCarbon(b13);

        float a14 = food.getFlourAmount();
        double b14 = a14 * 0.98 * 0.001;
        food.setFlourCarbon(b14);

        float a15 = food.getAlcoholAmount();
        double b15 = a15 * 0.99 * 0.001;
        food.setAlcoholCarbon(b15);

        float a16 = food.getMilkAmount();
        double b16 = a16 * 1.39 * 0.001;
        food.setMilkCarbon(b16);
//      碳酸饮料每瓶
        int a17 = food.getSodasAmount();
        double b17 = a17 * 130 * 0.001;
        food.setSodasCarbon(b17);
//        合计碳足迹
        double total = b1 + b2 + b3 + b4 + b5+ b6+ b7+ b8+ b9+ b10 +b11 +b12 +b13 +b14 +b15 +b16 +b17;
        food.setFoodTotal(total);
    }

}
