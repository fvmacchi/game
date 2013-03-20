package framework;

public interface Game {
	
	public void startGame(Screen startScreen);
	
	public void stopGame();
	
	public void pauseGame();
	
	public void resumeGame();
	
	public void goToScreen(Screen screen);
	
	public Screen getCurrentScreen();
	
	public Graphics getGraphics();
	
	public Resources getResources();
	
	public int getScreenWidth();
	
	public int getScreenHeight();
	
}
