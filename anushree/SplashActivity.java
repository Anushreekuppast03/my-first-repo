package com.example.anushree;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread t = new Thread()
		 {
			@Override
			public void run()
			{
				try {
					Thread.sleep(5000);
					Intent in = new Intent(SplashActivity.this, MainActivity.class);
					startActivity(in);
					finish();					
				}
				catch (InterruptedException e)
				{
				}
			}
			};
			t.start();			
  }

}

