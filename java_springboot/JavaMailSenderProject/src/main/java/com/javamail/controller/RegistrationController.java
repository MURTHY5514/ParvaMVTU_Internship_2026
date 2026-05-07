package com.javamail.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javamail.model.User;
import com.javamail.service.RegistrationService;

import jakarta.mail.MessagingException;
@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService emailService;

	/** GET /register — Show the registration form */
	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "register"; // renders templates/register.html
	}

	/** POST /register — Process form & send email 
	 * @throws UnsupportedEncodingException */
	@PostMapping("/register")
	public String handleRegistration(@ModelAttribute("user") User user, Model model) throws UnsupportedEncodingException {
		try {
			emailService.sendRegistrationEmail(user);
			// Pass data to the success page
			model.addAttribute("email", user.getEmail());
			model.addAttribute("name", user.getFullName());
			return "success"; // renders templates/success.html
		} catch (MessagingException e) {
			model.addAttribute("error", "Could not send email: " + e.getMessage());
			return "register"; // back to form with error
		}
	}

	/** GET / — Redirect to register page */
	@GetMapping("/")
	public String home() {
		return "redirect:/register";
	}
}
