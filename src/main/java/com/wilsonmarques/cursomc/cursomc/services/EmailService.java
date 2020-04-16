package com.wilsonmarques.cursomc.cursomc.services;

import com.wilsonmarques.cursomc.cursomc.domain.Pedido;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);
    
    void sendEmail(SimpleMailMessage msg);
}