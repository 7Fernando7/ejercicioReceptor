package com.neoris.ejercicioReceptor.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neoris.ejercicioReceptor.modelo.entities.Usuario;

@Service
public class RabbitReceiverService {
	
	@RabbitListener(queues = "${ejercicio.rabbitmq.queue}")
	public void receiveMessage(String mensajeRecibido) {
		System.out.println("Mensaje recibido: " + mensajeRecibido);
		//ObjectMapper objectMapper = new ObjectMapper();
		//Usuario usuario = objectMapper.readValue(usuario, Usuario.class);
	}
}
