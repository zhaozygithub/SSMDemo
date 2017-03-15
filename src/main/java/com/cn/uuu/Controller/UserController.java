package com.cn.uuu.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.uuu.Dao.Service.UserService;
import com.cn.uuu.Dao.po.UserT;

@Controller
public class UserController {
	
	@Autowired
	private UserService UserService;

	@RequestMapping("/user1/{id}")
	public String test(@PathVariable("id") Integer id, Map<String, UserT> map) {
		UserT userT = UserService.getUserbyID(id);
		map.put("user", userT);
		return "showUser";
	}
	@RequestMapping("/user2")
	public String test1(@RequestParam("id") Integer id, Map<String, UserT> map) {
		UserT userT = UserService.getUserbyID(id);
		map.put("user", userT);
		return "showUser";
	}
	
	@RequestMapping("/user")  
    public String toIndex(HttpServletRequest request,Model model){  
		UserT userT = UserService.getUserbyID(request.getParameter("id"));
		model.addAttribute("user", userT);
		return "showUser";
    }  
}
