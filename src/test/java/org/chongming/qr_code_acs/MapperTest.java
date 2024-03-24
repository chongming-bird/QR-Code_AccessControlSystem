package org.chongming.qr_code_acs;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Resource;
import org.chongming.qr_code_acs.entity.data_object.AccessRecord;
import org.chongming.qr_code_acs.mapper.AccessRecordMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Monty_Tung
 * @description 测试数据库连接
 * @date 2024-03-24 18:23
 */
@SpringBootTest
public class MapperTest {

    @Resource
    AccessRecordMapper accessRecordMapper;

    @Test
    public void AccessRecordTest() {
        List<AccessRecord> list = accessRecordMapper.selectList(new AccessRecord());
        for (AccessRecord ar : list) {
            System.out.println(ar.toString());
        }

    }

}

