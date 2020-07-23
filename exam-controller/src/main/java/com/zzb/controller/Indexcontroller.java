package com.zzb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzb.Service.UserService;
import com.zzb.entity.User;

@Controller
public class Indexcontroller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String user(Model model) {
		List<User> users=userService.getalluser();
		model.addAttribute("user",users);
		return "index";
	}
	
	@RequestMapping("del")
	public void deluser(int id,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = userService.deluser(id);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	//增加信息页面
	@RequestMapping("/adduser")
	public String registered(HttpServletRequest request) {
		return "adduser";
	}
	
	@RequestMapping("adddiuser")
	public void adduser(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = userService.adduser(user);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	//增加信息页面
	@RequestMapping("/modifyuser")
	public String modify(int id,HttpServletRequest request) {
		User user=userService.echoUser(id);
		return "update";
	}
	
	@RequestMapping("/xiugaiuser")
	public void xiugai(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = userService.modify(user);
		boolean result;
		if(row>0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
}







