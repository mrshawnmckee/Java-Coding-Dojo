package com.dojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	@GetMapping("")
	public String index(HttpSession session) {
		Integer count = 0;
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			count = (Integer)session.getAttribute("count");
			count ++;
			session.setAttribute("count", count);
		}
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String showCount() {
		
		return "countPage.jsp";
	}
	
	

}
