package org.chongming.qr_code_acs.entity.data_object;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 用户组：用户鉴权
 * @date 2024-03-23 16:51
 */
@Data
public class UserGroup {
    // id
    private Integer group_id;
    // 显示顺序权重
    private Integer display;
    // 名称
    private String name;
    // 描述：对用户组的特点或权限范围的描述
    private String description;
    // 来源表
    private String source_table;
    // 来源字段
    private String source_field;
    // 注册位置
    private String register;

    private Timestamp create_time;
    private Timestamp update_time;
}
