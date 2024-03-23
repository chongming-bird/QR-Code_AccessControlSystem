package org.chongming.qrcode_accesscontrolsystem.entity;

import lombok.Data;

/**
 * @author Monty_Tung
 * @description 后台管理
 * @date 2024-03-23 16:32
 * TODO:这个表找不到
 */
@Data
public class NavAdmin {
    // 后台导航
    private Integer adminId;
    // 导航名
    private String name;
    // 地址
    private String url;
}
