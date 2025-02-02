package ex03;

public class Point {
    private  float x = 0.0f, y = 0.0f;
    public Point() {};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(float x,float y) {
        return new float[] {this.x,this.y};
    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("x=" + x + ", y=" + y);
    }
}
