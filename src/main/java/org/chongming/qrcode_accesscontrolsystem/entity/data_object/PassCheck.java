package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 通行证表
 * @date 2024-03-23 16:41
 */
@Data
public class PassCheck {
    // id
    private Integer pass_check_id;
    // 用户名
    private Integer user_name;
    // 姓名
    private String full_name;
    // 性别
    private String gender;
    // 单元号
    private String unit_number;
    // 手机号
    private String phone_number;
    // 二维码
    private String qr_code;
    // 有效期
    private String term_of_validity;
    // 审核状态
    private String examine_state;
    // 更新时间
    private Timestamp update_time;
    // 创建时间
    private Timestamp create_time;
}
