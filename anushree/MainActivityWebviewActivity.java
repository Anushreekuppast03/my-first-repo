package com.example.anushree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivityWebviewActivity extends Activity {
WebView wv1;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_webview);
		wv1=(WebView)findViewById(R.id.webView1);  
	       wv1.loadUrl("https://www.google.com/");  
	  
			
		}}
