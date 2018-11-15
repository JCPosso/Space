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
	private Jugador player;	
	private Ovni naveInvasora;
	private bloqueEnemigo bloqueClasico;
	public static int SCORE = 0;
	
	private Font gameScreen = new Font("Arial", Font.PLAIN, 50);	
	
	public GameScreen( ) {
		naveInvasora = new Ovni(0,0);
		bloqueClasico =  new bloqueEnemigo(25,25,4,10);
		player = new Jugador(Display.WIDTH,Display.HEIGHT);
	}
	
	public void update(double delta) {
		naveInvasora.update(delta);
		bloqueClasico.updateAliens(delta);
	}
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.drawString("Score: " + SCORE, 15, 35);
		
		g.setColor(Color.red);
		g.drawString("Health: ", 5, 35);
		player.draw(g);
		naveInvasora.draw(g);
		bloqueClasico.drawAliens(g);
		}	
}
