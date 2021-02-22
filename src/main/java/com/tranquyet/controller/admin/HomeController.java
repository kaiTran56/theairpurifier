package com.tranquyet.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Admin")
public class HomeController {
	@RequestMapping(value = { "/admin/home", "/admin" }, method = RequestMethod.GET)
	public ModelAndView goHome() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
	}

	
	
	@RequestMapping(value = { "/admin/map.html" }, method = RequestMethod.GET)
	public ModelAndView goMap() {
		ModelAndView mav = new ModelAndView("admin/map");
		return mav;
	}
	
	@RequestMapping(value = { "/admin/notif.html" }, method = RequestMethod.GET)
	public ModelAndView goNotification() {
		ModelAndView mav = new ModelAndView("admin/notifications");
		return mav;
	}
}
