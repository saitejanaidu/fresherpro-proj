package com.example.demo;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class loginctrl<HttpServeletRequest, HttpServeletResponse> {
@RequestMapping("login")
public String logindetails(){
	return "login.jsp";
}


}

