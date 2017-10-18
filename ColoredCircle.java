public class ColoredCircle extends Circle { 
public int color; 

public void draw() { 
// (3) method to draw the colored circle
	System.out.println("Draw method in ColoredCircle");
	}

public static void main(String[] args) {
	Circle c = new Circle();
	ColoredCircle d =new ColoredCircle();
	c = d;
	c.draw();
}
}
