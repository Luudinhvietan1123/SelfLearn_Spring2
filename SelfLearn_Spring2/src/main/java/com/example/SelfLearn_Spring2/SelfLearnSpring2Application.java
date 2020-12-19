package com.example.SelfLearn_Spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SelfLearnSpring2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SelfLearnSpring2Application.class);
		GirlService girlService = context.getBean(GirlService.class);
		Girl girl = girlService.getRandomGirl();
		System.out.println(girl);
	}

}
