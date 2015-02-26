package com.wangyangyangtest.activity;

import com.wangyangyangtest.model.UserLoginModel;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class UserLogin extends BaseNewActivity{
	EditText name_edt,pwd_edt;
	Button login_btn,regist_btn;
	UserLoginModel loginModel ;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		name_edt = (EditText) findViewById(R.id.userLogin_name_editText1);
		pwd_edt = (EditText) findViewById(R.id.userLogin_pwd_editText) ;
		login_btn = (Button) findViewById(R.id.userLogin_login_btn);
		regist_btn = (Button) findViewById(R.id.userLogin_regist_btn);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.user_login);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		 loginModel = new UserLoginModel(context);
		login_btn.setOnClickListener(l);
	}
	OnClickListener l = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.userLogin_login_btn:
				new UserLoginHandler(context).execute();
				
				break;

			default:
				break;
			}
		}
	};

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	
	private class UserLoginHandler extends HandlerHelp{

		public UserLoginHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			loginModel.getUserLoginService(name_edt.getText().toString().trim(), pwd_edt.getText().toString().trim());
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}
}
