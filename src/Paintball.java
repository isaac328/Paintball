import processing.core.*;

public class Paintball 
{
	PApplet p;
	PVector pos;
	PVector vel;
	PVector acc;
	
	public Paintball(PApplet p)
	{
		this.p = p;
		pos = new PVector(p.mouseX, p.mouseY, 0);
		vel = new PVector(0,0,2);
		acc = new PVector(0,0.5f,0);
		
	}
	
	public void show()
	{
		p.stroke(0,255, 255);
		p.fill(0,255, 255);
		float size = p.map(pos.z, 0, 20, 50, 20);
		p.ellipse(pos.x, pos.y, size,  size);
	}
	
	public void update()
	{
		pos.add(vel);
		vel.limit(3);
		vel.add(acc);
		if(pos.z > 25)
		{
			acc.mult(0);
			vel.mult(0);
		}
	}
}
