import processing.core.PApplet

class ProcessingTest extends PApplet:
  override def settings =
    size(1024, 768)
  
  override def setup =
    background(255)
  
  override def draw =
    color(255, 255, 55, 1)
    rect(0, 0, 1024, 768)
    color(25)
    circle(mouseX.toFloat, mouseY.toFloat, 10)


object ProcessingTest extends App:
  PApplet.main("ProcessingTest")