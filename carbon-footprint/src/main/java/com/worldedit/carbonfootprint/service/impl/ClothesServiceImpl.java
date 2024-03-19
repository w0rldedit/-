package com.worldedit.carbonfootprint.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.common.ResultCode;
import com.worldedit.carbonfootprint.entity.Clothes;
import com.worldedit.carbonfootprint.entity.User;
import com.worldedit.carbonfootprint.mapper.ClothesMapper;
import com.worldedit.carbonfootprint.service.ClothesService;
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
public class ClothesServiceImpl extends ServiceImpl<ClothesMapper, Clothes> implements ClothesService {






//    衣物碳足迹转换函数
    @Override
    public void transform(Clothes clothes){
//      帽子
        int a1 = clothes.getHatAmount();
        double b1 = a1 * 1.217;
        clothes.setHatCarbon(b1);
//      羊毛织物
        int a2 = clothes.getFabricAmount();
        double b2 = a2 * 6.096;
        clothes.setFabricCarbon(b2);

        int a3 = clothes.getDenimAmount();
        double b3 = a3 * 12.21;
        clothes.setDenimCarbon(b3);

        int a4 = clothes.getCottonAmount();
        double b4 = a4 * 18.12;
        clothes.setCottonCarbon(b4);

        int a5 = clothes.getDownAmount();
        double b5 = a5 * 7.91;
        clothes.setDownCarbon(b5);

        int a6 = clothes.getShoesAmount();
        double b6 = a6 * 7.47;
        clothes.setShoesCarbon(b6);

        int a7 = clothes.getGlovesAmount();
        double b7 = a7 * 1.731;
        clothes.setGlovesCarbon(b7);

        int a8 = clothes.getSwimwearAmount();
        double b8 = a8 * 1.716;
        clothes.setSwimwearCarbon(b8);

        int a9 = clothes.getScarveAmount();
        double b9 = a9 * 2.652;
        clothes.setScarveCarbon(b9);

        int a10 = clothes.getTieAmount();
        double b10 = a10 * 1.326;
        clothes.setTieCarbon(b10);

        double total = b1 + b2 + b3 + b4 + b5+ b6+ b7+ b8+ b9+ b10;
        clothes.setTotalCarbon(total);
    }

}
