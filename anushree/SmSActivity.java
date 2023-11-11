package com.example.anushree;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmSActivity extends Activity {
EditText e1,e2;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sm_s);
		e1=(EditText)findViewById(R.id.editmobile);
		e2=(EditText)findViewById(R.id.editSms);
		b1=(Button)findViewById(R.id.btnSend);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 String phoneNo = e1.getText().toString();
	             String txt = e2.getText().toString(); 
	             Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse( "sms:" + phoneNo ) );
	             i1.putExtra( "sms_body", txt );
	             startActivity(i1);

	             Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();

			}
		});
	}
}