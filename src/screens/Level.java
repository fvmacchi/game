package screens;

import framework.Graphics;
import Entities.Ship;
import implementation.ScreenImp;

public abstract class Level extends ScreenImp{

	private Ship ship;
	
	public void init()
	{
		super.init();
		ship = new Ship();
	}

	@Override
	public void draw(Graphics g) {
		ship.draw(g);
	}
}
