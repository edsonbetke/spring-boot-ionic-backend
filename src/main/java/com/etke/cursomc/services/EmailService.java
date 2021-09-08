package com.etke.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.etke.cursomc.domain.Pedido;

public interface EmailService {

	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
