package aplicacion;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.util.ArrayList;

import aplicacion.*;
import java.awt.Color;
import java.awt.Font;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.util.ArrayList;

import java.awt.Color;
import java.awt.Font;

public class GameScreen  {
	
	private Player player;
	private Ovni naveInvasora;
	private ArrayList<Alien> enemies = new ArrayList<Alien>();
	public static int SCORE = 0;
	
	private Font gameScreen = new Font("Arial", Font.PLAIN, 48);	
	
	public GameScreen( ) {
		naveInvasora = new Ovni(0,0);
		addEnemies();

	}
	
	public void update(double delta) {
		naveInvasora.update(delta, player);
		updateAliens(delta);
	}
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.drawString("Score: " + SCORE, 5, 15);
		
		g.setColor(Color.red);
		g.drawString("Health: ", 5, 35);
		
		naveInvasora.draw(g);
		drawAliens(g);
		}
	
	
	
	
	
	
	public void addEnemies() {
		for(int y = 0; y < 5; y++){
			for(int x = 0; x < 10; x++){
				Alien e = new Alien(150 + (x * 40), 25 + (y * 40));
				enemies.add(e);
			}
		}
	}
	public void ChangeAliens(double delta) {
		if(enemies == null)
			return;
		
		for(int i = 0; i < enemies.size(); i++){
			if(enemies.get(i).isOutOfBounds()){
				enemies.get(i).changeDirection(delta);
			}
		}
	}
	public void updateAliens(double delta) {
		if(enemies == null)
			return;
		
		for(int i = 0; i < enemies.size(); i++){
			enemies.get(i).update(delta, player);
		}
		ChangeAliens(delta);
	}
	public void drawAliens(Graphics2D g) {
		if(enemies == null)
			return;
		
		for(int i = 0; i < enemies.size(); i++){
			enemies.get(i).draw(g);
		}
	}
	public void init(Canvas canvas) {
		
		canvas.addKeyListener(player);
	}

}
