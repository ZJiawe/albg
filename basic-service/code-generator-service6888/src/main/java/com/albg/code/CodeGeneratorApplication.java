package com.albg.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/12 18:01
 * @Description: 启动类
 */
@SpringBootApplication
@MapperScan("com.albg.code.domain.mapper*")
public class CodeGeneratorApplication {

    /**
     * springBoot启动类
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }

}
