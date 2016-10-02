package com.draupnir.erp.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/")
public class TestController extends BaseController{

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test(ModelMap model) {
		return "account/index";
	}

}
