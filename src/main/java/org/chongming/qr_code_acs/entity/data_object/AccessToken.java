package org.chongming.qr_code_acs.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 临时访问牌实体类
 * @date 2024-03-23 16:15
 */
@Data
public class AccessToken {
    // id
    private Integer token_id;
    // 临时访问牌
    private String token;
    // 最大寿命，默认2小时
    private Integer max_age;
    // 创建时间
    private Timestamp create_time;
    // 更新时间
    private Timestamp update_time;
    // 用户信息表id
    private Integer user_id;
}
