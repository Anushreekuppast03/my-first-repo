package com.example.anushree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivityradiobuttonactivity extends Activity {
RadioGroup rg1;
RadioButton rb1;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activityradiobuttonactivity);
		rg1=(RadioGroup) findViewById(R.id.radioGroup1);
		b1=(Button)findViewById(R.id.btnRadio);

		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   
			     rb1 = (RadioButton) findViewById(rg1.getCheckedRadioButtonId());  
			        
			     Toast.makeText(getApplicationContext(),rb1.getText(), Toast.LENGTH_SHORT).show();  
			}
		});	
	}
}
