import java.awt.Color;

public class Circle{
public double center_x, center_y; 
public double radius; 

public void draw() { 
// (1) method to draw circle on the screen
	System.out.println("Draw method in Cicle without Params");
} 

public void draw(Color color) { 
// (2) method to draw circle on the screen with a 
// given color
	System.out.println("Draw method in Cicle with Params");
}
}
