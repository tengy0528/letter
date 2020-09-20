package com.wgd.letter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.wgd.letter.mapper")
public class SpringBootLetterCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLetterCoreApplication.class, args);
	}
}
