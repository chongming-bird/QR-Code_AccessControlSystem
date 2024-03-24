package org.chongming.qr_code_acs.entity.data_object;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 访客申请表
 * @date 2024-03-23 16:54
 */
public class VisitorApplication {
    // id
    private Integer visitor_application_id;
    // 访客人
    private String visiting_guests;
    // 手机号
    private String phone_number;
    // 所去单元
    private String units_removed;
    // 进入原因
    private String entry_reason;
    // 进入时间
    private String entry_time;
    // 离开时间
    private String departure_time;
    // 二维码
    private String qr_code;
    // 有效期
    private String term_of_validity;
    // 审核状态
    private String examine_state;

    private Timestamp update_time;
    private Timestamp create_time;
}
