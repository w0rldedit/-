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
 * @since 2022-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Traffic对象", description="")
public class Traffic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "创建人")
    private Integer createId;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "飞机")
    private Integer fly;

    @ApiModelProperty(value = "高铁")
    private Integer highrail;

    @ApiModelProperty(value = "船")
    private Integer ship;

    @ApiModelProperty(value = "火车")
    private Integer train;

    @ApiModelProperty(value = "地铁")
    private Integer metro;

    @ApiModelProperty(value = "公交")
    private Integer bus;

    @ApiModelProperty(value = "大巴")
    private Integer car;

    @ApiModelProperty(value = "摩托")
    private Integer moto;

    @ApiModelProperty(value = "电动网约车")
    private Integer electaxi;

    @ApiModelProperty(value = "汽油网约车")
    private Integer gastaxi;

    @ApiModelProperty(value = "自驾")
    private Integer drive;

    @ApiModelProperty(value = "飞机碳足迹")
    private Double flyCarbon;

    @ApiModelProperty(value = "高铁碳足迹")
    private Double highrailCarbon;

    @ApiModelProperty(value = "船碳足迹")
    private Double shipCarbon;

    @ApiModelProperty(value = "火车碳足迹")
    private Double trainCarbon;

    @ApiModelProperty(value = "地铁碳足迹")
    private Double metroCarbon;

    @ApiModelProperty(value = "公交车碳足迹")
    private Double busCarbon;

    @ApiModelProperty(value = "大巴碳足迹")
    private Double carCarbon;

    @ApiModelProperty(value = "摩托碳足迹")
    private Double motoCarbon;

    @ApiModelProperty(value = "电动网约车碳足迹")
    private Double electaxiCarbon;

    @ApiModelProperty(value = "汽油网约车碳足迹")
    private Double gastaxiCarbon;

    @ApiModelProperty(value = "自驾碳足迹")
    private Double driveCarbon;

    @ApiModelProperty(value = "交通碳足迹总和")
    private Double trafficTotal;


}
