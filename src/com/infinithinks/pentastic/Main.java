package com.infinithinks.pentastic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.infinithinks.others.AndroidOnlyInterface;

public class Main implements AndroidOnlyInterface{
	
	private static Main application;
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "PENtastic";
		cfg.useGL20 = true;
		cfg.width = 1280;
		cfg.height = 720;
		if(application == null)
		{
			application = new Main();
		}
		new LwjglApplication(new PENtasticMain(application), cfg);
	}

	@Override
	public void shareChatOn(int message, String param1, String param2) {
		// TODO Auto-generated method stub
		
	}}
