import processing.core.PApplet
import scala.language.implicitConversions

val screenWidth = 1024
val screenHeight = 768

class ProcessingTest extends PApplet:
  override def settings =
    size(screenWidth, screenHeight)
  
  override def setup: Unit = 
    background(0)
  
  override def draw =
    stroke(0, 0, 0, 0)
    fill(255, 255, 255, 1)
    rect(0, 0, screenWidth, screenHeight)
    fill(0)
    circle(mouseX.toFloat, mouseY.toFloat, 20)

// Main function

@main def main() = PApplet.main("ProcessingTest")