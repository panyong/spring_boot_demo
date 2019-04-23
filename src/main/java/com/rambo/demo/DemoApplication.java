package com.rambo.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author panyong
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.rambo.demo.*.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log.info("=====spring_boot_demo run successful====");
		log.info(String.format("Using evn : %s", System.getProperty("spring.profiles.active")));
	}
}
