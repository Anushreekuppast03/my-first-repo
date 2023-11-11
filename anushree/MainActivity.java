package com.example.anushree;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btnMsg);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MsgActivity.class);
				startActivity(in);
			
			}
		});
        
        b2=(Button)findViewById(R.id.btncalc);
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,CalculatorMainActivity.class);
				startActivity(in);
			
			}
		});
        
        b3=(Button)findViewById(R.id.btncheck);
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,CheckboxMainActivity.class);
				startActivity(in);
			
			}
		});
        
        b4=(Button)findViewById(R.id.btnRadio);
        b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MainActivityradiobuttonactivity.class);
				startActivity(in);
			
			}
		});
        b5=(Button)findViewById(R.id.btnSms);
        b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,SmSActivity.class);
				startActivity(in);
			
			}
		});
        b6=(Button)findViewById(R.id.btnAudio);
        b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MainActivityAUDIOACTIVITY.class);
				startActivity(in);
			
			}
		});
        b7=(Button)findViewById(R.id.btnVideo);
        b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MainActivityVideoactivity.class);
				startActivity(in);
			
			}
		});
        b8=(Button)findViewById(R.id.btnWebview);
        b8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MainActivityWebviewActivity.class);
				startActivity(in);
			
			}
		});
        b9=(Button)findViewById(R.id.btnwhats___APP);
        b9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,MainActivitywhataApp.class);
				startActivity(in);
			
			}
		});
        b10=(Button)findViewById(R.id.btnSplash);
        b10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,SplashActivity.class);
				startActivity(in);
			
			}
		});
        b11=(Button)findViewById(R.id.btnDBA);
        b11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,DBAActivityDesignCode.class);
				startActivity(in);
			
			}
		});
        
        b12=(Button)findViewById(R.id.btnDate);
        b12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,DateandscreenMainActivity.class);
				startActivity(in);
			
			}
		});
        b13=(Button)findViewById(R.id.btnfeedback);
        b13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,FeedbackMainActivity.class);
				startActivity(in);
			
			}
		});
        b14=(Button)findViewById(R.id.btnAboutme);
        b14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,AboutmeMainActivity.class);
				startActivity(in);
			
			}
		});
        b15=(Button)findViewById(R.id.btncontact);
        b15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this,CONTACTMEMainActivity.class);
				startActivity(in);
			
			}
		});
    
    }


     
    
}
