package com.mygdx.totem;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.totem.Totem.status;

public class Totem extends ApplicationAdapter{
	
	static class status {
		  public static int statusOFgame;
		  public static int zmieniono;
		  public static int wybranamapa;
		  public static float xRatio;
		  public static float yRatio;
		  public static int sound = 1;
		  public static int mapchanged;
		  public static int back_click;
		  
		  
		}
	
	OrthographicCamera camera;
	Viewport viewport;

	Preferences prefs;
	
	public Texture texture;
	public SpriteBatch batch;

	public static int[] checkMarked = new int[17];
	
	public static Sprite[][] przycisk = new Sprite[5][5];
	public static int OSX1;
	public static int OSY1;
	
	public static Texture backgroundTexture;
	public static Sprite backgroundSprite;
	
	public static Texture redLightTexture;
	public static Sprite redLightSprite;
	
	public static Texture greenLightTexture;
	public static Sprite greenLightSprite;	
	
	public static Texture startButtonTexture;
	public static Sprite startButtonSprite;
	
	public static Texture resetButtonTexture;
	public static Sprite resetButtonSprite;
	
	public static Texture backButtonTexture;
	public static Sprite backButtonSprite;
	
	public static Texture mapSelectTexture1;
	public static Sprite mapSelectSprite1;
	public static Texture mapSelectTexture2;
	public static Sprite mapSelectSprite2;
	public static Texture mapSelectTexture3;
	public static Sprite mapSelectSprite3;
	public static Texture mapSelectTexture4;
	public static Sprite mapSelectSprite4;
	public static Texture mapSelectTexture5;
	public static Sprite mapSelectSprite5;
	public static Texture mapSelectTexture6;
	public static Sprite mapSelectSprite6;
	public static Texture mapSelectTexture7;
	public static Sprite mapSelectSprite7;
	public static Texture mapSelectTexture8;
	public static Sprite mapSelectSprite8;
	public static Texture mapSelectTexture9;
	public static Sprite mapSelectSprite9;
	public static Texture mapSelectTexture10;
	public static Sprite mapSelectSprite10;
	public static Texture mapSelectTexture11;
	public static Sprite mapSelectSprite11;
	public static Texture mapSelectTexture12;
	public static Sprite mapSelectSprite12;
	public static Texture mapSelectTexture13;
	public static Sprite mapSelectSprite13;
	public static Texture mapSelectTexture14;
	public static Sprite mapSelectSprite14;
	public static Texture mapSelectTexture15;
	public static Sprite mapSelectSprite15;
	public static Texture mapSelectTexture16;
	public static Sprite mapSelectSprite16;
	
	public static Texture SoundOnTexture;
	public static Sprite SoundOnSprite;
	public static Texture SoundOffTexture;
	public static Sprite SoundOffSprite;
	
	public static Texture HowToPlayTexture;
	public static Sprite HowToPlaySprite;
	
	public static Texture winTexture;
	public static Sprite winSprite;
	
	public static Texture checkmarkTexture;
	public static Sprite checkmarkSprite1;
	public static Sprite checkmarkSprite2;
	public static Sprite checkmarkSprite3;
	public static Sprite checkmarkSprite4;
	public static Sprite checkmarkSprite5;
	public static Sprite checkmarkSprite6;
	public static Sprite checkmarkSprite7;
	public static Sprite checkmarkSprite8;
	public static Sprite checkmarkSprite9;
	public static Sprite checkmarkSprite10;
	public static Sprite checkmarkSprite11;
	public static Sprite checkmarkSprite12;
	public static Sprite checkmarkSprite13;
	public static Sprite checkmarkSprite14;
	public static Sprite checkmarkSprite15;
	public static Sprite checkmarkSprite16;
	
	public static Texture logoTexture;
	public static Sprite logoSprite;
	
//******loads all the textures and sprites, and their position
	private void loadTextures()
	{
		
		SoundOnTexture = new Texture("SoundOn.png");
		SoundOnTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		SoundOnSprite = new Sprite(SoundOnTexture);
		SoundOnSprite.setPosition(720,540);
		
		SoundOffTexture = new Texture("SoundOff.png");
		SoundOffTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		SoundOffSprite = new Sprite(SoundOffTexture);
		SoundOffSprite.setPosition(720,540);
		
		backgroundTexture = new Texture("background1.png");
		backgroundTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		backgroundSprite = new Sprite(backgroundTexture);
		
		startButtonTexture = new Texture("pickMap.png");
		startButtonTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		startButtonSprite = new Sprite(startButtonTexture);
		startButtonSprite.setPosition(130,200);
		
		HowToPlayTexture = new Texture("HowToPlay.png");
		HowToPlayTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		HowToPlaySprite = new Sprite(HowToPlayTexture);
		HowToPlaySprite.setPosition(420,200);
		
		logoTexture = new Texture("logo4.png");
		logoSprite = new Sprite(logoTexture);
		logoTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		logoSprite.setPosition(50,375);
		
		
		winTexture = new Texture("win.png");
		winTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		winSprite = new Sprite(winTexture);
		
		checkmarkTexture = new Texture("Checkmark.png");
		checkmarkTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		
		checkmarkSprite1 = new Sprite(checkmarkTexture);
		checkmarkSprite1.setPosition(160,440);
		
		checkmarkSprite2 = new Sprite(checkmarkTexture);
		checkmarkSprite2.setPosition(285,440);
		
		checkmarkSprite3 = new Sprite(checkmarkTexture);
		checkmarkSprite3.setPosition(410,440);
		
		checkmarkSprite4 = new Sprite(checkmarkTexture);
		checkmarkSprite4.setPosition(535,440);
		
		checkmarkSprite5 = new Sprite(checkmarkTexture);
		checkmarkSprite5.setPosition(160,315);
		
		checkmarkSprite6 = new Sprite(checkmarkTexture);
		checkmarkSprite5.setPosition(285,315);
		
		checkmarkSprite7 = new Sprite(checkmarkTexture);
		checkmarkSprite7.setPosition(410,315);
		
		checkmarkSprite8 = new Sprite(checkmarkTexture);
		checkmarkSprite8.setPosition(535,315);

		checkmarkSprite9 = new Sprite(checkmarkTexture);
		checkmarkSprite9.setPosition(160,190);
		
		checkmarkSprite10 = new Sprite(checkmarkTexture);
		checkmarkSprite10.setPosition(285,190);
		
		checkmarkSprite11 = new Sprite(checkmarkTexture);
		checkmarkSprite10.setPosition(410,190);
		
		checkmarkSprite12 = new Sprite(checkmarkTexture);
		checkmarkSprite12.setPosition(535,190);
		
		checkmarkSprite13 = new Sprite(checkmarkTexture);
		checkmarkSprite13.setPosition(160,65);
		
		checkmarkSprite14 = new Sprite(checkmarkTexture);
		checkmarkSprite14.setPosition(285,65);
		
		checkmarkSprite15 = new Sprite(checkmarkTexture);
		checkmarkSprite15.setPosition(410,65);
		
		checkmarkSprite16 = new Sprite(checkmarkTexture);
		checkmarkSprite16.setPosition(535,65);
		
		
		resetButtonTexture = new Texture("resetButton2.png");
		resetButtonTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		resetButtonSprite = new Sprite(resetButtonTexture);	
		resetButtonSprite.setPosition(655,60);

		
		backButtonTexture = new Texture("backButton1.png");
		backButtonTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		backButtonSprite = new Sprite(backButtonTexture);
		backButtonSprite.setPosition(25,60);
		
		mapSelectTexture1 = new Texture("nmap1.png");
		mapSelectTexture1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite1 = new Sprite(mapSelectTexture1);
		mapSelectSprite1.setPosition(160,440);
		
		mapSelectTexture2 = new Texture("nmap2.png");
		mapSelectTexture2.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite2 = new Sprite(mapSelectTexture2);
		mapSelectSprite2.setPosition(285,440);
		
		mapSelectTexture3 = new Texture("nmap3.png");
		mapSelectTexture3.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite3 = new Sprite(mapSelectTexture3);
		mapSelectSprite3.setPosition(410,440);
		
		mapSelectTexture4 = new Texture("nmap4.png");
		mapSelectTexture4.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite4 = new Sprite(mapSelectTexture4);
		mapSelectSprite4.setPosition(535,440);
		
		mapSelectTexture5 = new Texture("nmap5.png");
		mapSelectTexture5.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite5 = new Sprite(mapSelectTexture5);
		mapSelectSprite5.setPosition(160,315);
		
		mapSelectTexture6 = new Texture("nmap6.png");
		mapSelectTexture6.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite6 = new Sprite(mapSelectTexture6);
		mapSelectSprite6.setPosition(285,315);
		
		mapSelectTexture7 = new Texture("nmap7.png");
		mapSelectTexture7.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite7 = new Sprite(mapSelectTexture7);
		mapSelectSprite7.setPosition(410,315);
		
		mapSelectTexture8 = new Texture("nmap8.png");
		mapSelectTexture8.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite8 = new Sprite(mapSelectTexture8);
		mapSelectSprite8.setPosition(535,315);
		
		mapSelectTexture9 = new Texture("nmap9.png");
		mapSelectTexture9.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite9 = new Sprite(mapSelectTexture9);
		mapSelectSprite9.setPosition(160,190);
		
		mapSelectTexture10 = new Texture("nmap10.png");
		mapSelectTexture10.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite10 = new Sprite(mapSelectTexture10);
		mapSelectSprite10.setPosition(285,190);
		
		mapSelectTexture11 = new Texture("nmap11.png");
		mapSelectTexture11.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite11 = new Sprite(mapSelectTexture11);
		mapSelectSprite11.setPosition(410,190);
		
		mapSelectTexture12 = new Texture("nmap12.png");
		mapSelectTexture12.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite12 = new Sprite(mapSelectTexture12);
		mapSelectSprite12.setPosition(535,190);
		
		mapSelectTexture13 = new Texture("nmap13.png");
		mapSelectTexture13.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite13 = new Sprite(mapSelectTexture13);
		mapSelectSprite13.setPosition(160,65);
		
		mapSelectTexture14 = new Texture("nmap14.png");
		mapSelectTexture14.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite14 = new Sprite(mapSelectTexture14);
		mapSelectSprite14.setPosition(285,65);
		
		mapSelectTexture15 = new Texture("nmap15.png");
		mapSelectTexture15.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite15 = new Sprite(mapSelectTexture15);
		mapSelectSprite15.setPosition(410,65);
		
		mapSelectTexture16 = new Texture("nmap16.png");
		mapSelectTexture16.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		mapSelectSprite16 = new Sprite(mapSelectTexture16);
		mapSelectSprite16.setPosition(535,65);
		
		redLightTexture = new Texture("red2.png");
		redLightSprite = new Sprite(redLightTexture);
		redLightTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		redLightSprite.setSize(100, 100);
		
		greenLightTexture = new Texture("green2.png");
		greenLightSprite = new Sprite(greenLightTexture);
		greenLightTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		greenLightSprite.setSize(100, 100);	
		

	}
//****** resize X axis of Sprites to fit/smooth them on all device resolutions
public static float resizeSpriteX()
{
	status.xRatio = (float) Gdx.app.getGraphics().getWidth() / (float) 800 ;
	return status.xRatio;
}

//****** resize Y axis of Sprites to fit/smooth them on all device resolutions
public static float resizeSpriteY()
{
	status.yRatio = (float) Gdx.app.getGraphics().getHeight()  / (float)600 ;
	return status.yRatio;
}

//****** Resets Lights position to its oiginal place of picked map
public static void resetMap()
{
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);
	if(input.x >= 655 * resizeSpriteX() && input.x <= 775 * resizeSpriteX()  && input.y >= 460 * resizeSpriteY() && input.y <= 540 * resizeSpriteY())
	{
		status.zmieniono = 0;
		matrixLights5x5Fill(przycisk, status.statusOFgame);	
	}
}

//****** Back Button
public static void getBack()
{
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);
	if(input.x >= 25 * resizeSpriteX() && input.x <= 145 * resizeSpriteX() && input.y >= 460 * resizeSpriteY() && input.y <= 540 * resizeSpriteY())
	{
		if(status.statusOFgame < 3)
		status.statusOFgame = status.statusOFgame - 1;
		else 
			setStatus(1);
	}
}

//***** functioning back button of device
public static void backButton()
{
	Gdx.input.setCatchBackKey(true);
	if(!Gdx.input.isKeyPressed(Input.Keys.BACK))
	{
		status.back_click = 0;
	}
	
	 if(Gdx.input.isKeyPressed(Input.Keys.BACK) && status.back_click == 0)
	 {
		status.statusOFgame = status.statusOFgame - 1;
		setStatus(status.statusOFgame);
        status.back_click = 1;
         
	 }
}


//***** Sound button. Method of turning it ON/OFF
public static void turnSound()
{
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);
	if(input.x >= 720 * resizeSpriteX() && input.x <= 770 * resizeSpriteX() && input.y >= 20 * resizeSpriteY() && input.y <= 60 * resizeSpriteY())
	{
		if(status.sound == 1){
			status.sound = 0;
		}
		else status.sound = 1;
	}
}

public static void setStatus(int gamestatus)
{
	status.statusOFgame = gamestatus;
}

//**** Rendering bacground Texture
public void renderBackground()
	{
		backgroundSprite.draw(batch);
		if(status.sound == 1)
			SoundOnSprite.draw(batch);
		else 
			SoundOffSprite.draw(batch);
		
	}

//***** Rendering starting game Sprites
public void startGame()
	{	 
		if(status.statusOFgame == 0)
		startButtonSprite.draw(batch);
		HowToPlaySprite.draw(batch);
		logoSprite.draw(batch);
	}

//***** Start Game function button
public static void startGamePosition()
{
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);
	
	if(input.x >= 130 && input.x <= 380*resizeSpriteX() && input.y >= 300 * resizeSpriteY() && input.y <= 400*resizeSpriteY())
	{
		setStatus(1);
	}
}

//***** Rendering map buttons Sprites and marked/solved maps
public void pickMap()
{
	if(status.statusOFgame == 1)

	backButtonSprite.draw(batch);
	mapSelectSprite1.draw(batch);
	mapSelectSprite2.draw(batch);
	mapSelectSprite3.draw(batch);
	mapSelectSprite4.draw(batch);
	mapSelectSprite5.draw(batch);
	mapSelectSprite6.draw(batch);
	mapSelectSprite7.draw(batch);
	mapSelectSprite8.draw(batch);
	mapSelectSprite9.draw(batch);
	mapSelectSprite10.draw(batch);
	mapSelectSprite11.draw(batch);
	mapSelectSprite12.draw(batch);
	mapSelectSprite13.draw(batch);
	mapSelectSprite14.draw(batch);
	mapSelectSprite15.draw(batch);
	mapSelectSprite16.draw(batch);
	

	for(int i=1; i<17; i++)
	{
		String test = Integer.toString(i);
		switch(prefs.getInteger(test))
		{
				case 1:
					checkmarkSprite1.draw(batch);
					break;
				case 2:
					checkmarkSprite2.draw(batch);
					break;
				case 3:
					checkmarkSprite3.draw(batch);
					break;
				case 4:
					checkmarkSprite4.draw(batch);
					break;
				case 5:
					checkmarkSprite5.draw(batch);
					break;
				case 6:
					checkmarkSprite6.draw(batch);
					break;
				case 7:
					checkmarkSprite7.draw(batch);
					break;
				case 8:
					checkmarkSprite8.draw(batch);
					break;
				case 9:
					checkmarkSprite9.draw(batch);
					break;
				case 10:
					checkmarkSprite10.draw(batch);
					break;
				case 11:
					checkmarkSprite11.draw(batch);
					break;
				case 12:
					checkmarkSprite12.draw(batch);
					break;
				case 13:
					checkmarkSprite13.draw(batch);
					break;
				case 14:
					checkmarkSprite14.draw(batch);
					break;
				case 15:
					checkmarkSprite15.draw(batch);
					break;
				case 16:
					checkmarkSprite16.draw(batch);
					break;
				
		}			
	}
}

//****** Picking map function and their position
public static void pickMapPosition()
{
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);
		
	
	if(input.x >= 160 *resizeSpriteX() && input.x <= 260 *resizeSpriteX()  && input.y >= 60 *resizeSpriteY() && input.y <= 160 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 1;
		status.zmieniono = 0;
	}
	
	if(input.x >= 285 *resizeSpriteX() && input.x <= 385 *resizeSpriteX() && input.y >= 60 *resizeSpriteY() && input.y <= 160 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 2;
		status.zmieniono = 0;
	}
	
	if(input.x >= 410 *resizeSpriteX() && input.x <= 510 *resizeSpriteX() && input.y >= 60 *resizeSpriteY() && input.y <= 160 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 3;
		status.zmieniono = 0;
	}
	
	if(input.x >= 535 *resizeSpriteX() && input.x <= 635 *resizeSpriteX() && input.y >= 60 *resizeSpriteY() && input.y <= 160 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 4;
		status.zmieniono = 0;
	}
	
	if(input.x >= 160 *resizeSpriteX() && input.x <= 260 *resizeSpriteX() && input.y >= 185 *resizeSpriteY() && input.y <= 285 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 5;
		status.zmieniono = 0;
	}
	
	if(input.x >= 285 *resizeSpriteX() && input.x <= 385 *resizeSpriteX() && input.y >= 185 *resizeSpriteY() && input.y <= 285 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 6;
		status.zmieniono = 0;
	}
	
	if(input.x >= 410 *resizeSpriteX() && input.x <= 510 *resizeSpriteX() && input.y >= 185 *resizeSpriteY() && input.y <= 285 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 7;
		status.zmieniono = 0;
	}
	
	if(input.x >= 535 *resizeSpriteX() && input.x <= 635 *resizeSpriteX() && input.y >= 185 *resizeSpriteY() && input.y <= 285 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 8;
		status.zmieniono = 0;
	}
	
	if(input.x >= 160 *resizeSpriteX() && input.x <= 260 *resizeSpriteX() && input.y >= 310 *resizeSpriteY() && input.y <= 410 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 9;
		status.zmieniono = 0;
	}
	
	if(input.x >= 285 *resizeSpriteX() && input.x <= 385 *resizeSpriteX() && input.y >= 310 *resizeSpriteY() && input.y <= 410 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 10;
		status.zmieniono = 0;
	}
	
	if(input.x >= 410 *resizeSpriteX() && input.x <= 510 *resizeSpriteX() && input.y >= 310 *resizeSpriteY() && input.y <= 410 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 11;
		status.zmieniono = 0;
	}
	
	if(input.x >= 535 *resizeSpriteX() && input.x <= 635 *resizeSpriteX() && input.y >= 310 *resizeSpriteY() && input.y <= 410 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 12;
		status.zmieniono = 0;
	}
	
	if(input.x >= 160 *resizeSpriteX() && input.x <= 260 *resizeSpriteX() && input.y >= 435 *resizeSpriteY() && input.y <= 535 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 13;
		status.zmieniono = 0;
	}
	
	if(input.x >= 285 *resizeSpriteX() && input.x <= 385 *resizeSpriteX() && input.y >= 435 *resizeSpriteY() && input.y <= 535 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 14;
		status.zmieniono = 0;
	}
	
	if(input.x >= 410 *resizeSpriteX() && input.x <= 510 *resizeSpriteX() && input.y >= 435 *resizeSpriteY() && input.y <= 535 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 15;
		status.zmieniono = 0;
	}
	
	if(input.x >= 535 *resizeSpriteX() && input.x <= 635 *resizeSpriteX() && input.y >= 435 *resizeSpriteY() && input.y <= 535 *resizeSpriteY())
	{
		setStatus(2);
		status.wybranamapa = 16;
		status.zmieniono = 0;
	}
	
	
}

//***** Next map function after solving
public static void endGame()
{
	
	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);

	if(input.x >= 270 *resizeSpriteX() && input.x <= 520 *resizeSpriteX()  && input.y >= 250 *resizeSpriteY() && input.y <= 330 *resizeSpriteY())
	{
		if(status.wybranamapa < 16)
		{
		status.wybranamapa = status.wybranamapa + 1;
		status.zmieniono = 0;
		setStatus(2);
		}
		else setStatus(1);		
	}
	
}

//**** Game check status
public void checkStatus(int gamestatus)
{
	switch(gamestatus)
	{
		case -1:
			 Gdx.app.exit();
			 break;
		case 0:
			startGame();
			break;
		case 1:
			pickMap();
			break;
		case 2:
			matrixLights5x5Fill(przycisk, status.statusOFgame);			
			matrixLights5x5Draw(przycisk, status.statusOFgame);
			break;
		case 3:	
			matrixLights5x5Fill(przycisk, status.statusOFgame);
			matrixLights5x5Draw(przycisk, status.statusOFgame);			
			break;	
	}
}

//***** Filling matrix of Lights with Red Sprites. After that predefined Green Lights are set depending on picked map	
public static void matrixLights5x5Fill(Sprite[][] obiekty, int gamestatus)
	{
		if(status.zmieniono == 0){
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				obiekty[i][j] = redLightSprite;
			}
		}
		whichMap(przycisk);
	}
		status.zmieniono = 1;
	}

//***** Map picker
public static void whichMap(Sprite[][] obiekty)
{
		
	if(status.wybranamapa == 1) map1(obiekty);
	if(status.wybranamapa == 2) map2(obiekty);
	if(status.wybranamapa == 3) map3(obiekty);
	if(status.wybranamapa == 4) map4(obiekty);
	if(status.wybranamapa == 5) map5(obiekty);
	if(status.wybranamapa == 6) map6(obiekty);
	if(status.wybranamapa == 7) map7(obiekty);
	if(status.wybranamapa == 8) map8(obiekty);
	if(status.wybranamapa == 9) map9(obiekty);
	if(status.wybranamapa == 10) map10(obiekty);
	if(status.wybranamapa == 11) map11(obiekty);
	if(status.wybranamapa == 12) map12(obiekty);
	if(status.wybranamapa == 13) map13(obiekty);
	if(status.wybranamapa == 14) map14(obiekty);
	if(status.wybranamapa == 15) map15(obiekty);
	if(status.wybranamapa == 16) map16(obiekty);
}
	

//***** Drawing Matrix of Lights. Checking if amp was solved, with all green lights on board
public void matrixLights5x5Draw(Sprite[][] obiekty, int gamestatus)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				batch.draw(obiekty[i][j],(150+(100*j)), (450-(100*i)), 100, 100);	
			}
		}
		if(checkIfOk(obiekty) == true) 
			{
				winSprite.draw(batch);
				setStatus(3);
				
			}
		resetButtonSprite.draw(batch);
		backButtonSprite.draw(batch);
	}

//**** Check method if all lights are Green
public boolean checkIfOk(Sprite[][] obiekty)
{
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			if(obiekty[i][j] != greenLightSprite) 
			{
				return false;				
			}
		}
	}
	int wybranamapa = status.wybranamapa;
	String wybranamapa_s = Integer.toString(wybranamapa);
	
	prefs.putInteger(wybranamapa_s, status.wybranamapa);
	prefs.flush();
	checkMarked[status.wybranamapa] = status.wybranamapa;
	return true;
}

//***** Method defining picked Light from the matrix
public static void pozycja(Sprite[][] obiekty)
{

	Vector3 input = new Vector3(InputManager.LiniaX, InputManager.LiniaY, 0);

for(int i=0; i<6; i++)
	{
		switch(i)
		{
		case 0: 
			if(input.x >= 150 *resizeSpriteX() && input.x <= 250 *resizeSpriteX())
			{
				InputManager.przyciskX = 0;
			}
			break;
		case 1: 
			if(input.x >= 250 *resizeSpriteX() && input.x <= 350 *resizeSpriteX())
			{
				InputManager.przyciskX = 1;
			}
			break;
		case 2: 
			if(input.x >= 350 *resizeSpriteX() && input.x <= 450 *resizeSpriteX())
			{
				InputManager.przyciskX = 2;
			}
			break;
		case 3: 
			if(input.x >= 450 *resizeSpriteX() && input.x <= 550 *resizeSpriteX())
			{
				InputManager.przyciskX = 3;
			}
			break;
		case 4: 
			if(input.x >= 550 *resizeSpriteX() && input.x <= 650 *resizeSpriteX())
			{
				InputManager.przyciskX = 4;
			}
			break;	
		case 5:
			if(input.x > 0 *resizeSpriteX() && input.x < 150 *resizeSpriteX() || input.x > 650 *resizeSpriteX() && input.x < 800 *resizeSpriteX())
			{
				InputManager.przyciskX = 5;
			}
			break;
		}
	}
	
for(int j=0; j<6; j++)
	{
		switch(j)
			{
			case 0: 
				if(input.y >= 50 *resizeSpriteY() && input.y <= 150 *resizeSpriteY())
				{
					InputManager.przyciskY = 0;
				}
				break;	
			case 1: 
				if(input.y >= 150 *resizeSpriteY() && input.y <= 250 *resizeSpriteY())
				{
					InputManager.przyciskY = 1;
				}
				break;	
			case 2: 
				if(input.y >= 250 *resizeSpriteY() && input.y <= 350 *resizeSpriteY())
				{
					InputManager.przyciskY = 2;
				}
				break;	
			case 3: 
				if(input.y >= 350 *resizeSpriteY() && input.y <= 450 *resizeSpriteY())
				{
					InputManager.przyciskY = 3;
				}
				break;	
			case 4: 
				if(input.y >= 450 *resizeSpriteY() && input.y <= 550 *resizeSpriteY())
				{
					InputManager.przyciskY = 4;
				}
				break;		
			case 5:
				if(input.y > 0 *resizeSpriteY() && input.y < 50 *resizeSpriteY() || input.y > 550 *resizeSpriteY() && input.y < 600 *resizeSpriteY())
				{
					InputManager.przyciskY = 5;
				}
				break;
			}	
	}
}

//***** Changing color of picked Light 
public static void zmienKolor(int X, int Y, Sprite[][] obiekty)
{

	if(obiekty[X][Y].equals(redLightSprite))
	{
		obiekty[X][Y] = greenLightSprite;
	}
	else obiekty[X][Y] = redLightSprite;
}

//**** Changing color of Lights on side of picked one
public static void zmienTotem(int X, int Y, Sprite[][] obiekty)
{

	if(X==0 && Y==0) // LEWY GORNY ROG
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X,Y+1, obiekty);
	}
	
	if(X>0 && X<4 && Y==0) // LEWA STRONA
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X-1,Y, obiekty);
		zmienKolor(X,Y+1, obiekty);
		
	}
	
	if(X==4 && Y==0) // LEWY DOLNY ROG
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X,Y+1, obiekty);
		zmienKolor(X-1,Y, obiekty);
	}
	
	if(Y>0 && Y<4 && X==4) // DOLNA STRONA
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X,Y+1, obiekty);
		zmienKolor(X,Y-1, obiekty);
		zmienKolor(X-1,Y, obiekty);
	}
	
	if(X==4 && Y==4) // PRAWY DOLNY ROG
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X-1,Y, obiekty);
		zmienKolor(X,Y-1, obiekty);
	}
	
	if(X>0 && X<4 && Y==4) // PRAWA STRONA
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X-1,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X,Y-1, obiekty);
	}
	
	if(X==0 && Y==4) // LEWY GORNY ROG
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X,Y-1, obiekty);
	}
	
	if(Y>0 && Y<4 && X==0) // GORNA STRONA
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X,Y-1, obiekty);
		zmienKolor(X,Y+1, obiekty);
	}
	
	if(Y>0 && Y<4 && X>0 && X<4) // SRODEK
	{
		zmienKolor(X,Y, obiekty);
		zmienKolor(X+1,Y, obiekty);
		zmienKolor(X-1,Y, obiekty);
		zmienKolor(X,Y-1, obiekty);
		zmienKolor(X,Y+1, obiekty);
	}	
	
	if(X==5 || Y==5)
	{
		
	
	}
}
//****** Predefined 16 Maps of Lights
public static void map1(Sprite[][] obiekty)
{
	obiekty[0][2] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
}

public static void map2(Sprite[][] obiekty)
{
	obiekty[0][0] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[4][0] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
}

public static void map3(Sprite[][] obiekty)
{
	obiekty[0][0] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[4][0] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
}

public static void map4(Sprite[][] obiekty)
{
	obiekty[0][3] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
}

public static void map5(Sprite[][] obiekty)
{
	obiekty[0][0] = greenLightSprite;
	obiekty[0][1] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][0] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
}

public static void map6(Sprite[][] obiekty)
{
	obiekty[0][0] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][0] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
}

public static void map7(Sprite[][] obiekty)
{

	obiekty[0][1] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

public static void map8(Sprite[][] obiekty)
{
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

public static void map9(Sprite[][] obiekty)
{
	obiekty[0][0] = greenLightSprite;
	obiekty[0][1] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[0][4] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[4][0] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
	obiekty[4][4] = greenLightSprite;
}

public static void map10(Sprite[][] obiekty)
{
	obiekty[0][1] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

public static void map11(Sprite[][] obiekty)
{
	obiekty[0][1] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
}

public static void map12(Sprite[][] obiekty)
{
	obiekty[0][1] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

public static void map13(Sprite[][] obiekty)
{
	obiekty[1][2] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
}

public static void map14(Sprite[][] obiekty)
{
	obiekty[0][1] = greenLightSprite;
	obiekty[0][2] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][2] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[2][0] = greenLightSprite;
	obiekty[2][1] = greenLightSprite;
	obiekty[2][2] = greenLightSprite;
	obiekty[2][3] = greenLightSprite;
	obiekty[2][4] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][2] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][2] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

public static void map15(Sprite[][] obiekty)
{
	obiekty[0][1] = greenLightSprite;
	obiekty[0][3] = greenLightSprite;
	obiekty[1][0] = greenLightSprite;
	obiekty[1][1] = greenLightSprite;
	obiekty[1][3] = greenLightSprite;
	obiekty[1][4] = greenLightSprite;
	obiekty[3][0] = greenLightSprite;
	obiekty[3][1] = greenLightSprite;
	obiekty[3][3] = greenLightSprite;
	obiekty[3][4] = greenLightSprite;
	obiekty[4][1] = greenLightSprite;
	obiekty[4][3] = greenLightSprite;
}

//*** Still a map. Solvable
public static void map16(Sprite[][] obiekty)
{
	
}


@Override
public void resize(int width, int height){
   viewport.update(width,height);
   viewport.apply();
   camera.position.set(camera.viewportWidth/2,camera.viewportHeight/2,0);
}

	@Override
	public void create () {	
		loadTextures();
		batch = new SpriteBatch();
		Gdx.input.setInputProcessor(new InputManager());
		camera = new OrthographicCamera();
	    viewport = new StretchViewport(800, 600, camera);
	    viewport.apply();
	    camera.position.set(camera.viewportWidth/2,camera.viewportHeight/2,0);
		matrixLights5x5Fill(przycisk, status.statusOFgame);
	}

//*** Main function
	@Override
	public void render () {
		backButton();
		
		prefs = Gdx.app.getPreferences("Marked");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glActiveTexture(GL20.GL_TEXTURE0);
		
		camera.update();
		batch.begin();
		batch.setProjectionMatrix(camera.combined);
		renderBackground();
		setStatus(status.statusOFgame);
		checkStatus(status.statusOFgame);	
		
		batch.end();
	}
	
	@Override
	public void dispose () {
		
		batch.dispose();
		texture.dispose();
		startButtonTexture.dispose();
		backgroundTexture.dispose();
		redLightTexture.dispose();
		greenLightTexture.dispose();
		startButtonTexture.dispose();
		resetButtonTexture.dispose();
		backButtonTexture.dispose();
		mapSelectTexture1.dispose();
		mapSelectTexture2.dispose();
		mapSelectTexture3.dispose();
		mapSelectTexture4.dispose();
		mapSelectTexture5.dispose();
		mapSelectTexture6.dispose();
		mapSelectTexture7.dispose();
		mapSelectTexture8.dispose();
		mapSelectTexture9.dispose();
		mapSelectTexture10.dispose();
		mapSelectTexture11.dispose();
		mapSelectTexture12.dispose();
		mapSelectTexture13.dispose();
		mapSelectTexture14.dispose();
		mapSelectTexture15.dispose();
		mapSelectTexture16.dispose();
		logoTexture.dispose();
		InputManager.Sound.dispose();
		
	}
}
