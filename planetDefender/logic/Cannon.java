package planetDefender.logic;

import math.Vector2D;

public class Cannon extends Vector2D {

    private float width, height;
    public Vector2D planetCenter = new Vector2D(100, 100);
    public Vector2D center = new Vector2D((getX() + this.getWidth()) / 2, (getY() + this.getHeight()) / 2);

    public Cannon(float x, float y) {
        super(x, y);
        width = 20;
        height = 20;

    }

    public void rotateAroundPlanet(float x, float y) {
        float a = planetCenter.sub(new Vector2D(x, y)).getLength();
        float b = planetCenter.sub(this).getLength();
        float c = (float) Math.sqrt(a*a + b*b);

        double Vx = Math.sin(a/c);
        double deg = Math.asin(Vx);


        rotate(deg * 100, planetCenter);

    }

    private Vector2D getFront() {
        return center;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
