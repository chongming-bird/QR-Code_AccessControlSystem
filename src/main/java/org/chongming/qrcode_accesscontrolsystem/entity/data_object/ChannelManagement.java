package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 通道管理表
 * @date 2024-03-23 16:27
 */
@Data
public class ChannelManagement {
    // id
    private Integer channel_management_id;
    // 通道名称
    private String channel_name;
    // 通道地点
    private String place;
    // 通道类型
    private String channel_type;
    // 通行人员
    private String passing_personnel;
    // 不可通行
    private String impassable;

    private Timestamp update_time;
    private Timestamp create_time;
}
