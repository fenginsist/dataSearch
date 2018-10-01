package com.feng.data_search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.feng.data_search.mapper")
public class DataSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataSearchApplication.class, args);
	}
}
