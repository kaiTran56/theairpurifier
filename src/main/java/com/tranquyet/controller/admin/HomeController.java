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

	@RequestMapping(value = { "/admin/icon" }, method = RequestMethod.GET)
	public ModelAndView goIcon() {
		ModelAndView mav = new ModelAndView("admin/icons");
		return mav;
	}

	@RequestMapping(value = { "/admin/map" }, method = RequestMethod.GET)
	public ModelAndView goMap() {
		ModelAndView mav = new ModelAndView("admin/map");
		return mav;
	}

	@RequestMapping(value = { "/admin/notif" }, method = RequestMethod.GET)
	public ModelAndView goNotification() {
		ModelAndView mav = new ModelAndView("admin/notifications");
		return mav;
	}

	@RequestMapping(value = { "/admin/table" }, method = RequestMethod.GET)
	public ModelAndView goTable() {
		ModelAndView mav = new ModelAndView("admin/tables");
		return mav;
	}

	@RequestMapping(value = { "/admin/typo" }, method = RequestMethod.GET)
	public ModelAndView goTypography() {
		ModelAndView mav = new ModelAndView("admin/typography");
		return mav;
	}

	@RequestMapping(value = { "/admin/upgrade" }, method = RequestMethod.GET)
	public ModelAndView goUpgrade() {
		ModelAndView mav = new ModelAndView("admin/upgrade");
		return mav;
	}

	@RequestMapping(value = { "/admin/user" }, method = RequestMethod.GET)
	public ModelAndView goUser() {
		ModelAndView mav = new ModelAndView("admin/user");
		return mav;
	}
}
