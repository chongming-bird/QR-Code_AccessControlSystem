package org.chongming.qrcode_accesscontrolsystem.entity.data_object;

import lombok.Data;

/**
 * @author Monty_Tung
 * @description 上传文件表
 * @date 2024-03-23 16:44
 */
@Data
public class Upload {
    // 上传id
    private Integer upload_id;
    // 文件名
    private String name;
    // 访问路径
    private String path;
    // 文件路径
    private String file;
    // 显示顺序
    private String display;
    // 父级id
    private Integer fatherId;
    // 文件夹
    private String dir;
    // 文件类型
    private String type;
}
