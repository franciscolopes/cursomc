package com.francisco.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.francisco.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
