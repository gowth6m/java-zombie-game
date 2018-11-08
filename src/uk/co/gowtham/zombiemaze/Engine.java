package uk.co.gowtham.zombiemaze;

import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Engine extends StateBasedGame {

	public static boolean _APPLET = true;
	
	public Engine() {
		super("Zombie Maze");
	}

	public static void main(String[] args) {
		_APPLET = false;
		//Set natives folder
		File f = new File("natives");
		if (f.exists()) System.setProperty("org.lwjgl.librarypath", f.getAbsolutePath());
		
		try {
			AppGameContainer game = new AppGameContainer(new Engine());
			game.setDisplayMode(Window.WIDTH, Window.HEIGHT, false);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		gc.setTargetFrameRate(Window.FPS);
		gc.setAlwaysRender(true);
		gc.setMaximumLogicUpdateInterval(Window.FPS);
		gc.setVSync(true);
		gc.setShowFPS(true);
	}

}
