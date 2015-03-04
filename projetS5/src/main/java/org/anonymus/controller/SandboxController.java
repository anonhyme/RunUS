package org.anonymus.controller;


import org.anonymus.sandbox.FormBean;
import org.anonymus.sandbox.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("formBean")
public class SandboxController {

	@Autowired
	String msg;

	@Autowired
	Customer customer;

	@RequestMapping("/showMessage")
	public ModelAndView showMessage() {
		ModelAndView mav = new ModelAndView("sandbox/showMessage");
		mav.addObject("message", "Welcome in the world");
		return mav;
	}

	@RequestMapping("/showCustomer")
	public ModelAndView showCustomer() {
		ModelAndView mav = new ModelAndView("sandbox/showCustomer");
		mav.addObject("customer", customer.getCustomer());

		return mav;
	}

	@ModelAttribute("formBean")
	public FormBean createFormBean() {
		return new FormBean();
	}

	@RequestMapping(value = "/form")
	public ModelAndView newForm() {
		ModelAndView mav = new ModelAndView("sandbox/form");
		return mav;
	}
}
