package Entities;

import important.Application;
import framework.Animation;
import framework.Graphics;
import framework.Image;
import framework.Resources;
import framework.Sprite;

public class Ship extends Sprite{

	private static final long serialVersionUID = 1L;

	public Ship()
	{
		super();
		Animation a = new Animation();
		Image i = Application.game.getResources().getImage("/sprites/shipsprites.png").subImage(59, 162, 80, 40);
		a.addScene(i, 1000);
		a.stopAnimation();
		addAnimation("default", a);
		setAnimationType("default");
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.setColor(255, 0, 0);
		g.drawRect((int)getX(), (int)getY(), getWidth(), getHeight());
	}
}
