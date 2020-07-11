package com.springmvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.entity.User;

public class UserValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	@Override
	public void validate(Object object, Errors errors) {
		//验证username、password是否为null
		ValidationUtils.rejectIfEmpty(errors, "username", null,"用户名不能为空");
		ValidationUtils.rejectIfEmpty(errors, "password", null,"密码不能为空");
	}
}

