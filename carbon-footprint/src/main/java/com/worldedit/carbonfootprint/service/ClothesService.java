package com.worldedit.carbonfootprint.service;

import com.worldedit.carbonfootprint.common.ResponseModel;
import com.worldedit.carbonfootprint.entity.Clothes;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author worldedit
 * @since 2022-05-03
 */
public interface ClothesService extends IService<Clothes> {

    void transform(Clothes clothes);

}
