package com.yayegor.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.consumer.AppConsumer;
import web.model.User;

@SpringBootApplication
public class Application {
		public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			AppConsumer appConsumer = context.getBean("appConsumer", AppConsumer.class);
			appConsumer.getAllUsers();
			appConsumer.createUser(new User(3L, "James", "Brown", (byte) 40));
			appConsumer.editUser(new User(3L, "Thomas", "Shelby", (byte) 30));
			appConsumer.deleteUser(3L);
			System.out.println(AppConsumer.result);
		}
}
