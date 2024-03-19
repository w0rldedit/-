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
 * @since 2022-05-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Clothes对象", description="")
public class Clothes implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "记录人id")
    private Integer createId;

    @ApiModelProperty(value = "记录时间")
    private Date createDate;

    @ApiModelProperty(value = "帽子个数")
    private Integer hatAmount;

    @ApiModelProperty(value = "羊毛织物件数")
    private Integer fabricAmount;

    @ApiModelProperty(value = "牛仔衣物件数")
    private Integer denimAmount;

    @ApiModelProperty(value = "棉制衣物件数")
    private Integer cottonAmount;

    @ApiModelProperty(value = "羽绒衣物件数")
    private Integer downAmount;

    @ApiModelProperty(value = "鞋子双数")
    private Integer shoesAmount;

    @ApiModelProperty(value = "手套双数")
    private Integer glovesAmount;

    @ApiModelProperty(value = "泳衣数")
    private Integer swimwearAmount;

    @ApiModelProperty(value = "围巾数")
    private Integer scarveAmount;

    @ApiModelProperty(value = "领带数")
    private Integer tieAmount;

    @ApiModelProperty(value = "帽子碳足迹")
    private Double hatCarbon;

    @ApiModelProperty(value = "羊毛织物碳足迹")
    private Double fabricCarbon;

    @ApiModelProperty(value = "牛仔衣物碳足迹")
    private Double denimCarbon;

    @ApiModelProperty(value = "棉制衣物碳足迹")
    private Double cottonCarbon;

    @ApiModelProperty(value = "羽绒衣物碳足迹")
    private Double downCarbon;

    @ApiModelProperty(value = "鞋子碳足迹")
    private Double shoesCarbon;

    @ApiModelProperty(value = "手套碳足迹")
    private Double glovesCarbon;

    @ApiModelProperty(value = "泳衣碳足迹")
    private Double swimwearCarbon;

    @ApiModelProperty(value = "围巾碳足迹")
    private Double scarveCarbon;

    @ApiModelProperty(value = "领带碳足迹")
    private Double tieCarbon;

    @ApiModelProperty(value = "衣物合计碳足迹")
    private Double totalCarbon;


}
