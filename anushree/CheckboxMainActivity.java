package com.example.anushree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class CheckboxMainActivity extends Activity {
CheckBox c1,c2,c3;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkbox_main);
		
		c1=(CheckBox)findViewById(R.id.checkBox1);

		c2=(CheckBox)findViewById(R.id.checkBox2);

		c3=(CheckBox)findViewById(R.id.checkBox3);
		
		b1=(Button) findViewById(R.id.btnBill);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int totalamount=0;
				StringBuilder result=new StringBuilder();
				result.append("Selected Items:");
				if(c1.isChecked()){
					result.append("\nPizza 100Rs");
					totalamount+=100;
				}
				if(c2.isChecked()){
					result.append("\nCoffe 50Rs");
					totalamount+=50;
				}
				if(c3.isChecked()){
					result.append("\nBurger 120Rs");
					totalamount+=120;
				}
				result.append("\nTotal: "+totalamount+"Rs");
				Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();	
			}
		});
	}
}
