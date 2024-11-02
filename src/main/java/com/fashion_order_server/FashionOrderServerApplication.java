package com.fashion_order_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fashion_order_server.mapper")
public class FashionOrderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionOrderServerApplication.class, args);
	}

}
