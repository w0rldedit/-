package com.worldedit.carbonfootprint.service;

import com.worldedit.carbonfootprint.entity.Traffic;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-04
 */
public interface TrafficService extends IService<Traffic> {

    void transform(Traffic traffic);
}
