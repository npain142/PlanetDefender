package math;

public class Vector2D {

    private float x, y;

    public Vector2D(float x, float y) {
        setX(x);
        setY(y);
    }


    public float getLength() {
        return (float) Math.sqrt(x*x + y*y);
    }

    public void translate(float x, float y) {

        

    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

}
