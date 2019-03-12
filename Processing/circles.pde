
void setup(){
  size(800, 600);
  background(0);
  
 
}

void draw(){
  float x = map(mouseX, 0, width,0, height);
  float y = map(mouseY, 0, width,0, height);
  
  strokeWeight(2);
  fill(255,23,345);
  ellipse(x,y,150,150);
}
