package com.yinglongyhy.o2o;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.yinglongyhy.o2o.repository")
public class O2oApplication {

    public static void main(String[] args) {
        SpringApplication.run(O2oApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
