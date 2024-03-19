package com.worldedit.carbonfootprint.service.impl;

import com.worldedit.carbonfootprint.entity.Room;
import com.worldedit.carbonfootprint.mapper.RoomMapper;
import com.worldedit.carbonfootprint.service.RoomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-05
 */
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {
    //    居住碳足迹转换
    @Override
    public void transform(Room room){

        int a1 = room.getWater();
        double b1 = a1 * 1.85;
        room.setWaterCarbon(b1);

        int a2 = room.getElec();
        double b2 = a2 * 0.5839;
        room.setElecCarbon(b2);

        int a3 = room.getCoal();
        double b3 = a3 * 1.87;
        room.setCoalCarbon(b3);

        int a4 = room.getGas();
        double b4 = a4 * 2.8;
        room.setGasCarbon(b4);

        int a5 = room.getCoalgas();
        double b5 = a5 * 0.23;
        room.setCoalgasCarbon(b5);

        int a6 = room.getWooden();
        double b6 = a6 * 5.07;
        room.setWoodenCarbon(b6);

        int a7 = room.getWaste();
        double b7 = a7 * 0.3532;
        room.setWasteCarbon(b7);

        int a8 = room.getHotel();
        double b8 = a8 * 48.254;
        room.setHotelCarbon(b8);

        double total = b1 + b2 + b3 + b4 + b5 + b6 + b7+ b8;
        room.setRoomTotal(total);
    }

}
