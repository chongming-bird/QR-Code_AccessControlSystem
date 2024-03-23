package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 出入记录表
 * @date 2024-03-23 16:14
 */
@Data
public class AccessRecord {
    // id
    private Integer access_record_id;
    // 用户
    private Integer user;
    // 姓名
    private String full_name;
    // 单元号
    private String unit_number;
    // 出入时间
    private Timestamp access_time;
    // 通道名称
    private String channel_name;
    // 通道地点
    private String place;
    // 更新时间
    private Timestamp update_time;
    // 创建时间
    private Timestamp create_time;
}
