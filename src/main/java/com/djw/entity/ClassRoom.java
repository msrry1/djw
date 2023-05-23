package com.djw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 *
 * @author dz
 * @date 2023-05-23
 */
@Data
@TableName("class_room")
@ApiModel(value = "", description = "")
public class ClassRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 教室主键id **/
    @ApiModelProperty("教室主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 教室楼层 **/
    @ApiModelProperty("教室楼层")
    private Integer floorNumber;

    /** 教室容纳人数 **/
    @ApiModelProperty("教室容纳人数")
    private Integer capacity;

    /** 教室空闲时间（','号分隔） **/
    @ApiModelProperty("教室空闲时间（','号分隔）")
    private String freeTime;

    /** 教室设备（','号分隔） **/
    @ApiModelProperty("教室设备（','号分隔）")
    private String equipment;

    /** 教室号（例207） **/
    @ApiModelProperty("教室号（例207）")
    private String roomNumber;


}
