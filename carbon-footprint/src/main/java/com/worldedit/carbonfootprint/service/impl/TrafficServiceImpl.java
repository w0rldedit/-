package com.worldedit.carbonfootprint.service.impl;

import com.worldedit.carbonfootprint.entity.Traffic;
import com.worldedit.carbonfootprint.mapper.TrafficMapper;
import com.worldedit.carbonfootprint.service.TrafficService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-04
 */
@Service
public class TrafficServiceImpl extends ServiceImpl<TrafficMapper, Traffic> implements TrafficService {
    //    交通碳足迹转换
    @Override
    public void transform(Traffic traffic){
        int a1 = traffic.getFly();
        double b1 = a1 * 0.088;
        traffic.setFlyCarbon(b1);

        int a2 = traffic.getHighrail();
        double b2 = a2 * 0.0262;
        traffic.setHighrailCarbon(b2);

        int a3 = traffic.getShip();
        double b3 = a3 * 0.128;
        traffic.setShipCarbon(b3);

        int a4 = traffic.getTrain();
        double b4= a4 * 0.018;
        traffic.setTrainCarbon(b4);

        int a5 = traffic.getMetro();
        double b5 = a5 * 0.0153;
        traffic.setMetroCarbon(b5);

        int a6 = traffic.getBus();
        double b6 = a6 * 0.011;
        traffic.setBusCarbon(b6);

        int a7 = traffic.getCar();
        double b7 = a7 * 0.174;
        traffic.setCarCarbon(b7);

        int a8 = traffic.getMoto();
        double b8 = a8 * 0.062;
        traffic.setMotoCarbon(b8);

        int a9 = traffic.getElectaxi();
        double b9 = a9 * 0.017;
        traffic.setElectaxiCarbon(b9);

        int a10 = traffic.getGastaxi();
        double b10 = a10 * 0.149;
        traffic.setGastaxiCarbon(b10);

        int a11 = traffic.getDrive();
        double b11 = a11 * 0.29;
        traffic.setDriveCarbon(b11);

        double total = b1 + b2 + b3 + b4 + b5+ b6+ b7+ b8 + b9 + b10 +b11;
        traffic.setTrafficTotal(total);
    }

}
