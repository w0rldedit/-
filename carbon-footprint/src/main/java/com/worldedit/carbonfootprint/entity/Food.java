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
@ApiModel(value="Food对象", description="")
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "记录人id")
    private Integer createId;

    @ApiModelProperty(value = "记录时间")
    private Date createDate;

    @ApiModelProperty(value = "米饭量")
    private Float riceAmount;

    @ApiModelProperty(value = "谷物")
    private Float grainsAmount;

    @ApiModelProperty(value = "豆类")
    private Float pulsesAmount;

    @ApiModelProperty(value = "鱼类")
    private Float fishAmount;

    @ApiModelProperty(value = "牛肉")
    private Float beefAmount;

    @ApiModelProperty(value = "羊肉")
    private Float muttonAmount;

    @ApiModelProperty(value = "猪肉")
    private Float porkAmount;

    @ApiModelProperty(value = "鸡肉")
    private Float chickenAmount;

    @ApiModelProperty(value = "茶")
    private Float teaAmount;

    @ApiModelProperty(value = "蛋类")
    private Float eggsAmount;

    @ApiModelProperty(value = "食用油")
    private Float oilAmount;

    @ApiModelProperty(value = "蔬菜")
    private Float vegetablesAmount;

    @ApiModelProperty(value = "水果")
    private Float fruitAmount;

    @ApiModelProperty(value = "面粉")
    private Float flourAmount;

    @ApiModelProperty(value = "酒类")
    private Float alcoholAmount;

    @ApiModelProperty(value = "牛奶")
    private Float milkAmount;
// 瓶，整数
    @ApiModelProperty(value = "碳酸饮料瓶数")
    private Integer sodasAmount;

    @ApiModelProperty(value = "米饭碳足迹")
    private Double riceCarbon;

    @ApiModelProperty(value = "谷物碳足迹")
    private Double grainsCarbon;

    @ApiModelProperty(value = "豆类碳足迹")
    private Double plusesCarbon;

    @ApiModelProperty(value = "鱼类碳足迹")
    private Double fishCarbon;

    @ApiModelProperty(value = "牛肉碳足迹")
    private Double beefCarbon;

    @ApiModelProperty(value = "羊肉碳足迹")
    private Double muttonCarbon;

    @ApiModelProperty(value = "猪肉碳足迹")
    private Double porkCarbon;

    @ApiModelProperty(value = "鸡肉碳足迹")
    private Double chickenCarbon;

    @ApiModelProperty(value = "茶碳足迹")
    private Double teaCarbon;

    @ApiModelProperty(value = "蛋类碳足迹")
    private Double eggsCarbon;

    @ApiModelProperty(value = "食用油碳足迹")
    private Double oilCarbon;

    @ApiModelProperty(value = "蔬菜碳足迹")
    private Double vegetablesCarbon;

    @ApiModelProperty(value = "水果碳足迹")
    private Double fruitCarbon;

    @ApiModelProperty(value = "面粉碳足迹")
    private Double flourCarbon;

    @ApiModelProperty(value = "酒类碳足迹")
    private Double alcoholCarbon;

    @ApiModelProperty(value = "牛奶碳足迹")
    private Double milkCarbon;

    @ApiModelProperty(value = "碳酸饮料碳足迹")
    private Double sodasCarbon;

    @ApiModelProperty(value = "食物碳足迹合计")
    private Double foodTotal;


}
