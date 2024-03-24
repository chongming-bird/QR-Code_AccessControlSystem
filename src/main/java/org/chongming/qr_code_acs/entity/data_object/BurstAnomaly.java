package org.chongming.qr_code_acs.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 突发异常表
 * @date 2024-03-23 16:25
 */
@Data
public class BurstAnomaly {
    // id
    private Integer burst_anomaly_id;
    // 异常名称
    private String exception_name;
    // 发生时间
    private String time_of_occurrence;
    // 处理方式
    private String treatment_method;
    // 详情简介
    private String details;
    // 事件经过
    private String event_process;

    private Timestamp update_time;
    private Timestamp create_time;
}
