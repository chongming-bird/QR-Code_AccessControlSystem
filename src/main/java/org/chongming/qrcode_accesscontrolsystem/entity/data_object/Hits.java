package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 访问表
 * @date 2024-03-23 16:28
 */
@Data
public class Hits {
    // id
    private Integer hits_id;
    // 访问人（用户） id
    private Integer user_id;

    private Timestamp create_time;
    private Timestamp update_time;

    // 来源表
    private String source_table;
    // 来源字段
    private String source_field;
    // 来源id
    private Integer source_id;
}
