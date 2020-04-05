package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class Demo1Application {
	@RequestMapping("/")
	public ModelAndView home () {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	public static void main(String[] args) {
		
		
		
		
		SpringApplication.run(Demo1Application.class, args);
	}

}
