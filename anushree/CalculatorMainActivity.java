package com.example.anushree;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorMainActivity extends Activity {
	EditText e1,e2,e3;
	Button b1,b2,b3,b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_main);

		e1=(EditText)findViewById(R.id.editText1);
	e2=(EditText)findViewById(R.id.editText2);
	e3=(EditText)findViewById(R.id.editText3);
	
	b1=(Button)findViewById(R.id.button1);
	b2=(Button)findViewById(R.id.button2);
	b3=(Button)findViewById(R.id.button3);
	b4=(Button)findViewById(R.id.button4);
	
	b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(e1.getText().toString())+Integer.parseInt(e2.getText().toString());
			e3.setText(String.valueOf(a));
	
		}
	});

	b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(e1.getText().toString())-Integer.parseInt(e2.getText().toString());
			e3.setText(String.valueOf(a));
	
		}
	});

	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(e1.getText().toString())*Integer.parseInt(e2.getText().toString());
			e3.setText(String.valueOf(a));
	
		}
	});

	b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(e1.getText().toString())/Integer.parseInt(e2.getText().toString());
			e3.setText(String.valueOf(a));
	
		}
	});
}
}
