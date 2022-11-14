package com.yayegor.springboot;

import com.yayegor.springboot.web.config.AppConfig;
import com.yayegor.springboot.web.consumer.AppConsumer;
import com.yayegor.springboot.web.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
