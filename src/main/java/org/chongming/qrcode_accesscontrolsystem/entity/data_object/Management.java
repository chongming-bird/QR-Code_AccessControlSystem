package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 管理人员表
 * @date 2024-03-23 16:31
 */
@Data
public class Management {
    // id
    private Integer management_id;
    // 工号
    private String job_number;
    // 姓名
    private String full_name;
    // 性别
    private String gender;
    // 职位
    private String position;
    // 入职时间
    private String entry_time;
    // 用户编号
    private Integer user_id;

    private Timestamp update_time;
    private Timestamp create_time;
}
