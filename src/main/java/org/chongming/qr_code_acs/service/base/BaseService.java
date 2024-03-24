package org.chongming.qr_code_acs.service.base;

import io.mybatis.mapper.Mapper;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

/**
 * @author Monty_Tung
 * @description BaseService类，实现基础功能
 * @param <E> 实体类
 * @date 2024-03-24 19:49
 */
@Slf4j
public class BaseService <E>{

    private Mapper mapper;

    /**
     * 在子类构造函数中调用，指明具体的mapper层
     * @param mapper
     */
    public void init(Mapper mapper) {
        this.mapper = mapper;

    }
}
