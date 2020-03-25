package com.ceiba.movies.infrastructure.adapter.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SendMessage {
	
	private final static String QUEUE_NAME = "movies";
	private final static Logger LOGGER = Logger.getLogger("bitacora.subnivel.Control");
    
	
	public void send(Long dni) throws IOException, TimeoutException {
	    ConnectionFactory factory = new ConnectionFactory();
	    try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
	        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
	        String message = dni.toString();
	        channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
	        LOGGER.log(Level.INFO," [xxxxx] Sent '" + message + "'");
	    }
	}
}
