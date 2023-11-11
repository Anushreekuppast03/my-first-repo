package com.example.anushree;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class FeedbackMainActivity extends Activity {
	Button b1;
	RatingBar r1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback_main);
		Button bt=(Button)findViewById(R.id.btnfeedback);
		bt.setOnClickListener(new View.OnClickListener(){
	

	@Override
	public void onClick(View v){
		//
		r1=(RatingBar)findViewById(R.id.ratingBar1);
		float f=r1.getRating();
		Toast.makeText(getApplicationContext(), "Rating is : " + String.valueOf(f),Toast.LENGTH_LONG).show();
		
	}
	});

}
}