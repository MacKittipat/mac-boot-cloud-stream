package com.mackittipat.macbootcloudstream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@Slf4j
@SpringBootApplication
public class MacBootCloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacBootCloudStreamApplication.class, args);
	}

	// Default channel name is numberConsumer-in-0
	@Bean
	public Consumer<Integer> numberConsumer() {
		return incomingNumber -> log.info("Incoming Number : {}", incomingNumber);
	}

}
