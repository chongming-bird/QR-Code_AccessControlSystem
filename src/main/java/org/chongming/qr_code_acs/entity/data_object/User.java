package org.chongming.qr_code_acs.entity.data_object;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 用户表
 * @date 2024-03-23 16:46
 */
@Data
public class User {
    // 用户 id
    private Integer user_Id;
    // 账户状态：(1可用|2异常|3已冻结|4已注销)
    private Integer state;
    // 用户组（分组授权）
    private String user_group;
    // 上次登陆时间
    private Timestamp login_time;
    // 手机号码：[0,11]用户的手机号码，用于找回密码时或登录时
    private String phone;
    // 手机认证：(0未认证|1审核中|2已认证)
    private Integer phone_state;
    // 用户名：[0,16]用户登录时所用的账户名称
    private String username;
    // 昵称：[0,16]
    private String nickname;
    // 密码：[0,32]用户登录所需的密码，由6-16位数字或英文组成
    private String password;
    // 邮箱：[0,64]用户的邮箱，用于找回密码时或登录时
    private String email;
    // 邮箱认证：(0未认证|1审核中|2已认证)
    private Integer email_state;
    // 头像地址：【0，255】
    private String avatar;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp create_time;

    private String code;
}
