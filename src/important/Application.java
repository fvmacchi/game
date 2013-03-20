package important;

import screens.levels.FirstLevel;
import implementation.GameImp;

public class Application {

	public static final int MILLISECONDS_PER_FRAME = 20;
	public static GameImp game;
	
	public static void main(String[] args)
	{
		game = new GameImp();
		game.startGame(new FirstLevel());
	}
	
}
