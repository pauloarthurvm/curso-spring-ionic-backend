package com.paulovarassin.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.paulovarassin.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
