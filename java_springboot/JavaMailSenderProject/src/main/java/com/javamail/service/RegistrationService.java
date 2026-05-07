package com.javamail.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.javamail.model.User;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class RegistrationService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private TemplateEngine templateEngine;
	@Value("${app.mail.from}")
	private String fromEmail;
	@Value("${app.mail.from-name}")
	private String fromName;

	public void sendRegistrationEmail(User user) throws MessagingException, UnsupportedEncodingException {
		// Step 1: Build Thymeleaf context with template variables
		Context ctx = new Context();
		ctx.setVariable("user", user);
		ctx.setVariable("registeredOn", new Date());
		// Step 2: Render template → HTML string
		String htmlContent = templateEngine.process("registration-email", ctx);
		// Step 3: Create MIME email message
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
		helper.setFrom(fromEmail, fromName);
		helper.setTo(user.getEmail());
		helper.setSubject("Registration Successful — Welcome!");
		helper.setText(htmlContent, true); // true = HTML content
		// Step 4: Send the email
		mailSender.send(mimeMessage);
	}
}
