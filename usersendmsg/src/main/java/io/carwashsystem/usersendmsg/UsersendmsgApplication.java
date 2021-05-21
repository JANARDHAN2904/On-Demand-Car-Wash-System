package io.carwashsystem.usersendmsg;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersendmsgApplication  implements CommandLineRunner
{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(UsersendmsgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(SenderConfig.topicExchangeName,"message_routing_key", 
				"I want to place an Order for my car wash");
		System.out.println("Message sent successfully...");
	}
}