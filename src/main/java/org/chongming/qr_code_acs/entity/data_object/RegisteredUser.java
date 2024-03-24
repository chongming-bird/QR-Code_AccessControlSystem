package org.chongming.qr_code_acs.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 注册用户表
 * @date 2024-03-23 16:43
 */
@Data
public class RegisteredUser {
    // RegisteredUser编号
    private Integer registered_user_id;
    // 用户名
    private String user_name;
    // 姓名
    private String full_name;
    // 性别c
    private String gender;
    // 单元号
    private String unit_number;
    // 个人介绍
    private String personal_introduction;
    // 用户编号
    private Integer user_id;

    private Timestamp update_time;
    private Timestamp create_time;
}
