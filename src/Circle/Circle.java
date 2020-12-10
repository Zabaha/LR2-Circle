package Circle;

public class Circle {
    private int x, y, radius;
    Circle(){}
    Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getP(){
        return 2 * Math.PI * radius;
    }

    public double getS(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Coordinates: (" + x + "; " + y + ")\nRadius: " + radius;
    }
}
