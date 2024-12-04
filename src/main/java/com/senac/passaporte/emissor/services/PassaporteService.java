package com.senac.passaporte.emissor.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.passaporte.emissor.entities.Passaporte;

@Service
public class PassaporteService {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public Passaporte adicionarPassaporte(Passaporte passaporte) {
		
		rabbitTemplate.convertAndSend("fila-ecommerce", passaporte);
        
        return passaporte;
	}
	
}
