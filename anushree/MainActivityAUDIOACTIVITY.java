package com.example.anushree;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityAUDIOACTIVITY extends Activity {
Button b1,b2,b3; 
MediaPlayer m;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_audioactivity);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		 
		m = MediaPlayer.create(getBaseContext(), R.raw.comedymusic);
		
			  
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(m.isPlaying()==false)
				{
					m.start();
				}				
				play();
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(m.isPlaying()==true)
				{
					m.stop();
				}			
				play();
			}
		});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		finish();
	}
});
	}
	 public void play()
	    {
	    	boolean play = m.isPlaying();
	    	
	    	if(play==true)
		{
			Toast.makeText(getBaseContext(), "Song is Playing", Toast.LENGTH_SHORT).show();
		}
	    	
	    	else 
	    	{
	    		Toast.makeText(getBaseContext(), "Song is not Playing", Toast.LENGTH_SHORT).show();
	    	}
	    }
	     
	}

 


