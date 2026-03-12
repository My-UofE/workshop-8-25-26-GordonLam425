
public class MovableCircle implements Movable, Shape { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }

  public String toString() {
    return "MovableCircle[center=" + center + ",radius=" + radius + "]";
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  
}
