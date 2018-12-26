import java.util.ArrayList;
import processing.core.*;

public class Target extends PApplet
{

	ArrayList<Paintball> paintballs;
	public static void main(String[] args) 
	{
		PApplet.main("Target");
	}
	
	public void settings()
	{
		size(800,600,P2D);
	}
	
	public void setup()
	{
		colorMode(HSB);
		paintballs = new ArrayList<>();
	}
	
	public void draw()
	{
		drawTarget();
		for(Paintball p : paintballs)
		{
			p.show();
			p.update();
		}
	}
	
	public void drawTarget()
	{
		background(0);
		stroke(255);
		fill(255);
		ellipse(width/2, height/2, 550,550);
		stroke(0);
		fill(0);
		ellipse(width/2, height/2, 450, 450);
		stroke(255);
		fill(255);
		ellipse(width/2, height/2, 350,350);
		stroke(0);
		fill(0);
		ellipse(width/2, height/2, 250,250);
		stroke(255);
		fill(255);
		ellipse(width/2, height/2, 150, 150);
		stroke(0);
		fill(0);
		ellipse(width/2, height/2, 50, 50);
	}
	
	public void mouseClicked()
	{
		paintballs.add(new Paintball(this));
	}
}
