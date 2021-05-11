package com.gwq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
@EnableScheduling

public class GwqJobExecutorApplication {

	public static void main(String[] args) {
        SpringApplication.run(GwqJobExecutorApplication.class, args);
	}

}