package com.wangyangyangtest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.wangyangyangtest.API.UserLoginAPI;

import android.content.Context;
import net.yasite.service.BaseService;

public class UserLoginService extends BaseService{

	public UserLoginService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
   public void getUserLogin(String name,String pwd){
	   
	List<NameValuePair> pm = new ArrayList<NameValuePair>();
	pm.add(new BasicNameValuePair("Name", name));
	pm.add(getValue("Pwd", pwd));
	UserLoginAPI api = new UserLoginAPI(context, pm);
	try {
		if(api.doPost()){
			api.getHandleResult();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
