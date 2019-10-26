package com.zsf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述 启动类
 * @author zsf
 * @date 2019/6/21
 * @param
 * @return
 */
@SpringBootApplication
public class DevApplication {

    private static final Logger logger = LoggerFactory.getLogger(DevApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
        logger.info("DevfreemarkdemoApplication 启动成功!");
    }


}
