package com.wangyangyangtest.activity;

import net.yasite.test.R;
import net.yasite.test.R.layout;
import net.yasite.test.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class CartoonActivity1 extends Activity {
	ImageView cartoon_image ;
	AlphaAnimation alphaAnimation ;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cartoon_activity1);
		cartoon_image = (ImageView) findViewById(R.id.cartoon_imagae1);
		alphaAnimation = new AlphaAnimation(0, 1);
		alphaAnimation.setDuration(3000);
		cartoon_image.setAnimation(alphaAnimation);
		alphaAnimation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
			//	intent = new Intent(CartoonActivity1.this, cls)
			}
		});
	}
	

	

}
