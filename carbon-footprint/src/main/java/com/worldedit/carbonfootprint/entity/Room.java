package com.worldedit.carbonfootprint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author worldedit
 * @since 2022-05-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Room对象", description="")
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "记录人id")
    private Integer createId;

    @ApiModelProperty(value = "记录时间")
    private Date createDate;

    @ApiModelProperty(value = "用水（立方米)")
    private Integer water;

    @ApiModelProperty(value = "用电（千瓦时）")
    private Integer elec;

    @ApiModelProperty(value = "用煤")
    private Integer coal;

    @ApiModelProperty(value = "天然气")
    private Integer gas;

    @ApiModelProperty(value = "煤气")
    private Integer coalgas;

    @ApiModelProperty(value = "木家具")
    private Integer wooden;

    @ApiModelProperty(value = "垃圾")
    private Integer waste;

    @ApiModelProperty(value = "酒店（晚）")
    private Integer hotel;

    @ApiModelProperty(value = "水碳足迹")
    private Double waterCarbon;

    @ApiModelProperty(value = "电碳足迹")
    private Double elecCarbon;

    @ApiModelProperty(value = "煤碳足迹")
    private Double coalCarbon;

    @ApiModelProperty(value = "天然气碳足迹")
    private Double gasCarbon;

    @ApiModelProperty(value = "煤气碳足迹")
    private Double coalgasCarbon;

    @ApiModelProperty(value = "木家具碳足迹")
    private Double woodenCarbon;

    @ApiModelProperty(value = "垃圾碳足迹")
    private Double wasteCarbon;

    @ApiModelProperty(value = "酒店碳足迹")
    private Double hotelCarbon;

    @ApiModelProperty(value = "住合计")
    private Double roomTotal;


}
