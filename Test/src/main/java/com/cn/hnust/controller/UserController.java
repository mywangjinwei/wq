package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser.action")
	public String toIndex(int id,HttpServletRequest request,Model model){
		//int userId = Integer.parseInt(request.getParameter("id"));
		
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("/showUser.actiond")
	public String delete(int id,HttpServletRequest request,Model model){
		userService.getdeleteUser(id);
		System.out.println(id+"---------------------");
		return "showUser";
	}
	@RequestMapping("/insert.action")
	public String Insert(User user,HttpServletRequest request,Model model){
	userService.getInsert(user);
	System.out.println(user);
		return "showUser";
		
	}
	@RequestMapping("/update.action")
	public String Update (User user, Model model){
		userService.getUpdate(user);
		
		return "showUser";
	}
	
}
