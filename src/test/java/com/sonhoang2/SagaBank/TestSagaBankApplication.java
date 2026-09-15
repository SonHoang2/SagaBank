package com.sonhoang2.SagaBank;

import org.springframework.boot.SpringApplication;

public class TestSagaBankApplication {

	public static void main(String[] args) {
		SpringApplication.from(SagaBankApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
