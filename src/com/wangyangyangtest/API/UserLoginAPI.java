package com.wangyangyangtest.API;

import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.api.params.BaseHttpParam;

public class UserLoginAPI extends BaseAPI{
	public UserLoginAPI(Context context, List<NameValuePair> pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/UserLoginModel/"+pm.get(0)+"&"+pm.get(1));
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}

}
