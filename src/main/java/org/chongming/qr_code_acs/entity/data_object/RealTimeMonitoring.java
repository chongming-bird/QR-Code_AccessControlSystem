package org.chongming.qr_code_acs.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 实时监控表
 * @date 2024-03-23 16:42
 */
@Data
public class RealTimeMonitoring {
    // id
    private Integer real_time_monitoring_id;
    // 通道名称
    private String channel_name;
    // 通道地点
    private String place;
    // 通道状态
    private String channel_status;
    // 监控时间
    private String monitoring_time;
    // 状态详情
    private String status_details;
    // 警戒值
    private Integer warning_value;

    private Timestamp update_time;
    private Timestamp create_time;
}
