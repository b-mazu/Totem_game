package com.mygdx.totem;

import com.badlogic.gdx.*;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.mygdx.totem.Totem.status;

public class InputManager extends InputAdapter 
{

	public static int LiniaX;
	public static int LiniaY;
	
	public static int przyciskX;
	public static int przyciskY;
	
	public static int clicked;
	
	public static int redDot;
	
	public static Sound Sound = Gdx.audio.newSound(Gdx.files.internal("sound.mp3"));
	
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		LiniaX = screenX;
		LiniaY = screenY;

		if(Totem.status.statusOFgame == 0)
		{
			Totem.startGamePosition();
			LiniaX = 0;
			LiniaY = 0;
		}
		
		if(Totem.status.statusOFgame == 1)
		{
			Totem.pickMapPosition();
			Totem.getBack();
			clicked = 0;
		}
		
		if(Totem.status.statusOFgame == 2 && clicked ==1 )
		{
			Totem.pozycja(Totem.przycisk);
			redDot = 1;
		}
		
		if(Totem.status.statusOFgame == 2)
		{
			Totem.resetMap();	
			Totem.getBack();
		}
		
		if(Totem.status.statusOFgame == 3)
		{		
			Totem.getBack();
		}
		Totem.turnSound();
		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		if(status.sound == 1) Sound.play(1.0f);
		else Sound.stop(InputManager.Sound.play(1.0f));
		
		if(Totem.status.statusOFgame == 3 )
		{
			Totem.endGame();
		}
		
		if(Totem.status.statusOFgame == 2) 
		{
			clicked = 1;
		}


		if(Totem.status.statusOFgame == 2 && redDot == 1 ){
			if(clicked == 1)
		Totem.zmienTotem(przyciskY, przyciskX, Totem.przycisk);
			LiniaX = 0;
			LiniaY = 0;
			przyciskX = 5;
			przyciskY = 5;
		}
	
		return true;
	}

}
