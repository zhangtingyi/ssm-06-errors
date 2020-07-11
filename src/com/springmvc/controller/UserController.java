package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.User;
import com.springmvc.validator.UserValidator;

@Controller
public class UserController {
	@RequestMapping(value="/errors",method=RequestMethod.GET)
	public String errorsTest(Model model){
		User user = new User();
		//model中添加属性user，值是user对象
		user.setHide("hideTag");

		model.addAttribute("user",user);
		return "errors";
	}
	@InitBinder
	public void initBinder(DataBinder binder){
		//设置验证的类为UserValidator
		binder.setValidator(new UserValidator());
	}
	@RequestMapping(value="/errors",method=RequestMethod.POST)
	public String errors(@Validated User user,Errors errors){
		//如果errors对象有Field错误时，重新跳回注册页面，否则正常提交
		if(errors.hasFieldErrors())
			return "errors";
		return "submit";
	}
}

