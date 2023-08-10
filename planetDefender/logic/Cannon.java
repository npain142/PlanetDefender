package planetDefender.logic;

import math.Vector2D;

public class Cannon extends Vector2D {

    private float width, height;
    public Vector2D planetCenter = new Vector2D(100, 100);
    public Vector2D cannonCenter = new Vector2D((getX() + this.getWidth()) / 2, (getY() + this.getHeight()) / 2);
    public Vector2D startPoint = new Vector2D(0, 0);
    public Cannon(float x, float y) {
        super(x, y);
        width = 20;
        height = 20;

    }

    public Cannon(float x1, float y1, float x2, float y2) {
        super(x2, y2);
    }

    public void rotateAroundPlanet(float x, float y) {
        
        Vector2D v = new Vector2D(x, y);

        Vector2D centerA = this.sub(planetCenter);
        Vector2D centerB = v.sub(planetCenter);


        double Vx = (centerA.scalarProduct(centerB))/(centerA.getLength()*centerB.getLength());

        double deg = Math.acos(Vx);
        deg = Math.toDegrees(deg);
        // double deg = Math.acos(Vx);
        
        

        System.out.println("Degrees: " + deg);
        rotate(deg, planetCenter);

    }

    


    private Vector2D getFront() {
        return cannonCenter;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
