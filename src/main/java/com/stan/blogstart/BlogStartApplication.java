package com.stan.blogstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.stan.mapper")
public class BlogStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogStartApplication.class, args);
	}

}
