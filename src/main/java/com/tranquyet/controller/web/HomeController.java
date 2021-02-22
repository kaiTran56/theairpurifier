package com.tranquyet.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="Web")
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}

	@RequestMapping(value = "home/error", method = RequestMethod.GET)
	public ModelAndView showError() {
		ModelAndView mav = new ModelAndView("web/404");
		return mav;
	}
	
	@RequestMapping(value = "/home/account.html", method = RequestMethod.GET)
	public ModelAndView showAccount() {
		ModelAndView mav = new ModelAndView("web/account");
		return mav;
	}
	
	@RequestMapping(value = "/home/contact.html", method = RequestMethod.GET)
	public ModelAndView showContact() {
		ModelAndView mav = new ModelAndView("web/contact");
		return mav;
	}
	@RequestMapping(value = "/home/blog.html", method = RequestMethod.GET)
	public ModelAndView showBlog() {
		ModelAndView mav = new ModelAndView("web/blog");
		return mav;
	}
	
	@RequestMapping(value = "/home/wishlist.html", method = RequestMethod.GET)
	public ModelAndView showWishList() {
		ModelAndView mav = new ModelAndView("web/wishlist");
		return mav;
	}
	
	@RequestMapping(value = "/home/checkout.html", method = RequestMethod.GET)
	public ModelAndView showCheckout() {
		ModelAndView mav = new ModelAndView("web/checkout");
		return mav;
	}

}
