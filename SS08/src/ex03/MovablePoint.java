package ex03;

public class MovablePoint extends Point {
private float xSpeed, ySpeed ;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint( float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "("+super.getX()+ ","+super.getY()+")"+",speed"+ "("+xSpeed+ ","+ySpeed+")";
    }

    public MovablePoint move() {
        float x = super.getX()+xSpeed;
        float y = super.getY()+ySpeed;

        setX(x);
        setY(y);
        return this;
    }
}
