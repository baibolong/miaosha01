package com.baibl.miaosha;


import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.baibl.miaosha"})
@RestController
@MapperScan("com.baibl.miaosha.dao")
public class App {




    public static void main( String[] args ) {



        SpringApplication.run(App.class);
    }
}
