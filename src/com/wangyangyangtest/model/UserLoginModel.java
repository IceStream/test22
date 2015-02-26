package com.wangyangyangtest.model;

import com.wangyangyangtest.service.UserLoginService;

import android.content.Context;


import net.yasite.model.Model;

public class UserLoginModel extends Model {
	UserLoginService loginService ;
    public UserLoginModel(Context context) {
		// TODO Auto-generated constructor stub
    	this.context = context;
    	loginService = new UserLoginService(context); 
	}	
	public void getUserLoginService(String name,String pwd){
		loginService.getUserLogin(name, pwd);
	}
}
