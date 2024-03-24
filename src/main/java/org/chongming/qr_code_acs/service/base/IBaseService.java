package org.chongming.qr_code_acs.service.base;

import io.mybatis.mapper.Mapper;

import javax.management.Query;
import java.util.Map;

/**
 * @author Monty_Tung
 * @description 通用service接口
 * @date 2024-03-24 20:23
 */
public interface IBaseService {

    void insert(Map<String, Object> body);

    void update(Map<String,String> query,
                Map<String,String> config,
                Map<String,Object> body);

    Map<String,Object> selectToPage(Map<String,String> query,
                                    Map<String,String> config);

    Map<String,Object> selectToList(Map<String,String> query,
                                    Map<String,String> config);

}
