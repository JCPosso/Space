	package aplicacion;

	import java.awt.Graphics2D;
	import java.awt.image.BufferedImage;
	import java.io.IOException;
	import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public  class bloqueEnemigo {
		protected BufferedImage pSprite;

		private ArrayList<Alien> enemies = new ArrayList<Alien>();		
		private int Width ,Height ;
		private int rows,cols;
		
		public bloqueEnemigo(int Width, int Height,int rows, int cols){
			this.Width = Width;
			this.Height = Height;
			this.cols=cols;
			this.rows=rows;
			addEnemies(rows,cols);
			}
		
		public void addEnemies(int rows ,int cols) {
				for(int y = 0; y < rows; y++){
					for(int x = 0; x < cols; x++){
						Alien e = new Alien(150 + (x * 40), 25 + (y * 40));
						enemies.add(e);
					}
				}
			}
		public void ChangeAliens(double delta) {
				if(enemies == null)
					return;
				
				for(int i = 0; i < 10; i++){
					if(enemies.get(i).isOutOfBounds()){
						for(int j = 0; j < enemies.size(); j++){
							enemies.get(j).changeDirection(delta);
							
							}
						}
					}
			}
		public void updateAliens(double delta) {
				if(enemies == null)
					return;
				
				for(int i = 0; i < enemies.size(); i++){
					enemies.get(i).update(delta);
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
	}
