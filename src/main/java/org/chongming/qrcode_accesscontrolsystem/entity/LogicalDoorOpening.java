package org.chongming.qrcode_accesscontrolsystem.entity;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 逻辑开门表
 * @date 2024-03-23 16:30
 */
public class LogicalDoorOpening {
    // id
    private Integer logical_door_opening_id;
    // 名称
    private String name;
    // 地址
    private String address;
    // 编号
    private String number;
    // 开门要求
    private String open_request;

    private Timestamp update_time;
    private Timestamp create_time;
}
