package io.carwashsystem.userreceivemsg;

import org.springframework.stereotype.Component;

@Component
public class JMSReceiver 
{

	public void receiveMessage(String message)
	{
		System.out.println("Received <" + message + ">");

	}
}