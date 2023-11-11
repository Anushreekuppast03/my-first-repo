package com.example.anushree;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle; 
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivityVideoactivity extends Activity {

	VideoView video;
	MediaController controller;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_videoactivity);
		 Uri UriPath=Uri.parse("android.resource://" + getPackageName() + "/"  +R.raw.baby);
	        video = (VideoView) findViewById(R.id.videoView1);
	        controller = new MediaController(MainActivityVideoactivity.this);
	        
	        video.setMediaController(controller); 
	        video.setVideoURI(UriPath);
	        
	        video.requestFocus();
	        video.start();
	        
	        		if(video.isPlaying()==true)
	          		{
	          			video.stopPlayback();
	         			video.clearFocus();
	          		} 
	    }
}
