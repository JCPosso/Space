package aplicacion;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class StateMachine {
	private GameScreen game ;
	private Canvas canvas;
	private byte selectState = 0;
	
	public StateMachine(Canvas canvas){
		game = new GameScreen();
		
		this.canvas = canvas;
		game.init(canvas);
	}
	
	public void draw(Graphics2D g){
		game.draw(g);
	}	
	public void update(double delta){
		game.update(delta);
	}
	public void setState() {
		game.init(canvas);
	}
}