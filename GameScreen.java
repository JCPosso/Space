package aplicacion;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.util.ArrayList;

import aplicacion.*;
import java.awt.Color;
import java.awt.Font;

public class GameScreen  {
	
	private Player player;
	
	public static int SCORE = 0;
	
	private Font gameScreen = new Font("Arial", Font.PLAIN, 48);	
	public GameScreen( ) {
		player = new Player(Display.WIDTH/2-50, Display.HEIGHT-75, 100, 100);

	}
	
	public void update(double delta) {
		player.update(delta);
		
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.drawString("Score: " + SCORE, 5, 15);
		
		g.setColor(Color.red);
		g.drawString("Health: " + player.getHealth(), 5, 35);
		
		
		player.draw(g);
		}
	public void init(Canvas canvas) {
		
		canvas.addKeyListener(player);
	}

}
