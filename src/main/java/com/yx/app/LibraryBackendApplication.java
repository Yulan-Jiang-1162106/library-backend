package com.yx.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//SpringBootApplication呢個註解佢係掃描一個包，掃描嘅就係我哋呢個com.yx,啫掃描呢個包下邊嘅所有內容
@SpringBootApplication(scanBasePackages = "com.yx")
//
@MapperScan("com.yx.mapper")
public class LibraryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryBackendApplication.class, args);
    }

}
