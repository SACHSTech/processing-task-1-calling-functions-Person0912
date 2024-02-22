import processing.core.PApplet;

/**
 * A program Sketch.java that draws a flower in the middle of a field
 * with clouds in the sky.
 * @author: Kayla Jin
 */

public class Sketch extends PApplet {
	
  public void settings() {
	  
    // Size of window
    size(400, 400);
  }

  public void setup() {
    
    // Background colour
    background(137, 206, 214);
  }

  public void draw() {

    // Flower stem
    fill(150, 255, 173);
    stroke(150, 255, 173);
    rect(192, 200, 16, 200);
    
    // Flower petals
    fill(250, 180, 180);
    stroke(250, 180, 180);
    ellipse(175, 175, 65, 65);
    ellipse(225, 175, 65, 65);
    ellipse(175, 225, 65, 65);
    ellipse(225, 225, 65, 65);
    
    // Flower centre
    fill(240, 231, 163);
    stroke(240, 231, 163);
    ellipse(200, 200, 60, 60);

    // Grass
    fill(135, 250, 141);
    stroke(135, 250, 141);
    rect(0, 325, 400, 75);

    // Grass Textures
    stroke(71, 181, 76);
    line(50, 350, 150, 350);
    line(10, 375, 60, 375);
    line(250, 367, 300, 367);
    line(187, 389, 234, 389);

    // Left Cloud
    fill(255, 255, 255);
    stroke(255, 255, 255);
    ellipse(50, 50, 50, 50);
    ellipse(75, 60, 50, 50);
    ellipse(85, 45, 50, 50);
    ellipse(100, 64, 50, 50);

    // Right Cloud
    ellipse(250, 70, 50, 50);
    ellipse(275, 80, 50, 50);
    ellipse(310, 65, 50, 50);
    ellipse(300, 84, 50, 50);
    ellipse(280, 60, 50, 50);
  }
}