package src.aplicacion;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class bala  {

	private double speed = 2.0d; 
	private BufferedImage pSprite;
	
	private int Width ,Height ;
	private double xPos , yPos;
	
	public bala(double xPos, double yPos){;
		this.Width = 10;
		this.Height= 10;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void draw(Graphics2D g) {
		URL url = this.getClass().getResource("misil.gif");
		 try {
			pSprite = ImageIO.read(url);
			g.drawImage(pSprite, (int)xPos, (int)yPos, Width, Height, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void update(double delta, Player player) {
		yPos= yPos + (delta * speed);
	}

}
