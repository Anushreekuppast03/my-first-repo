package com.example.anushree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class DateandscreenMainActivity extends Activity {
EditText e1;
Button b1;
DatePicker d1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dateandscreen_main);
		e1=(EditText)findViewById(R.id.editDate);
		b1=(Button)findViewById(R.id.btnDate);
		d1=(DatePicker)findViewById(R.id.datePicker1);
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				StringBuilder b=new StringBuilder();
				b.append("Current Date: "+(d1.getMonth() + 1)+"/"+d1.getDayOfMonth()+"/"+d1.getYear()); 
				e1.setText(b.toString());
			}
		});
		
	}
		
		
	}

