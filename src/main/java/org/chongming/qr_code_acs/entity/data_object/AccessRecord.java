package org.chongming.qr_code_acs.entity.data_object;

import io.mybatis.provider.Entity;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Monty_Tung
 * @description 出入记录表
 * 使用 通用Mapper 项目
 * 实体类配置好映射的表名和字段，就能自动生成对应的基类Mapper
 * 提供基础CRUD方法，简化开发
 * 未配置则默认以类名/属性名映射（不做任何转换）
 * @date 2024-03-23 16:14
 */
@Data
@Entity.Table("access_record")
public class AccessRecord {
    // id
    @Entity.Column("access_record_id")
    private Integer access_record_id;
    // 用户
    @Entity.Column("user")
    private Integer user;
    // 姓名
    @Entity.Column("full_name")
    private String full_name;
    // 单元号
    @Entity.Column("unit_number")
    private String unit_number;
    // 出入时间
    @Entity.Column("access_time")
    private Timestamp access_time;
    // 通道名称
    @Entity.Column("channel_name")
    private String channel_name;
    // 通道地点
    @Entity.Column("place")
    private String place;
    // 更新时间
    @Entity.Column("update_time")
    private Timestamp update_time;
    // 创建时间
    @Entity.Column("create_time")
    private Timestamp create_time;
}
