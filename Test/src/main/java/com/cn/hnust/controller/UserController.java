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
	//查找用户
	@RequestMapping("/showUser.action")
	public String toIndex(int id,HttpServletRequest request,Model model){
		//int userId = Integer.parseInt(request.getParameter("id"));
		
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
	}
	//删除用户
	@RequestMapping("/showUser.actiond")
	public String delete(int id,HttpServletRequest request,Model model){
		userService.getdeleteUser(id);
		System.out.println(id+"---------------------");
		return "showUser";
	}
	//插入用户
	@RequestMapping("/insert.action")
	public String Insert(User user,HttpServletRequest request,Model model){
	userService.getInsert(user);
	System.out.println(user);
		return "showUser";
		
	}//更新用户
	@RequestMapping("/update.action")
	public String Update (User user, Model model){
		userService.getUpdate(user);
		
		return "showUser";
	}
	
}
