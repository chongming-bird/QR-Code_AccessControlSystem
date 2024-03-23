package org.chongming.qrcode_accesscontrolsystem.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 权限表
 * @date 2024-03-23 16:18
 */
@Data
public class Auth {
    // 授权id
    private Integer authId;
    // 用户组
    private String userGroup;
    // 模块名
    private String modName;
    // 表名
    private String tableName;
    // 页面标题
    private String pageTitle;
    // 路由路径
    private String path;
    // 位置
    private String position;
    // 跳转方式
    private String mode;
    // 是否可增加
    private Integer add;
    // 是否可删除
    private Integer del;
    // 是否可修改
    private Integer set;
    // 是否可查看
    private Integer get;
    // 添加字段
    private String fieldAdd;
    // 修改字段
    private String fieldSet;
    // 查询字段
    private String fieldGet;
    // 跨表导航名称
    private String tableNavName;
    // 是否跨表操作
    private Boolean tableNav;
    // 配置
    private String option;

    private Timestamp createTime;
    private Timestamp updateTime;

}
