package org.chongming.qr_code_acs.entity.data_object;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 脱机运行表
 * @date 2024-03-23 16:34
 */
public class OfflineRunning {
    // id
    private Integer offline_running_id;
    // 异常名称
    private String exception_name;
    // 脱机时间
    private String offline_time;
    // 恢复时间
    private String recovery_time;
    // 脱机原因
    private String offline_reason;
    // 处理方式
    private String treatment_method;

    private Timestamp update_time;
    private Timestamp create_time;
}
