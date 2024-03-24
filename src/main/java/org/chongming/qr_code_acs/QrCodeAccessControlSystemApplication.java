package org.chongming.qr_code_acs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.chongming.qr_code_acs.mapper")
@SpringBootApplication
public class QrCodeAccessControlSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(QrCodeAccessControlSystemApplication.class, args);
    }

}
