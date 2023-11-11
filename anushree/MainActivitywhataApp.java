package com.example.anushree;
 import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivitywhataApp extends Activity {
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitywhata_app);
		 b1=(Button)findViewById(R.id.btnWA);
		 
		 b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_MAIN);
			    intent.setComponent(ComponentName.unflattenFromString("com.whatsapp/.Main"));
			    intent.addCategory(Intent.CATEGORY_LAUNCHER);
			    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			    startActivity(intent);	
			}
		});
		 
		 
		 
	}
}
