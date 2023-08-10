package math.primitives;


import math.Vector2D;

public class Line2D {

    Vector2D start, end;

    public Line2D(Vector2D start, Vector2D end) {
        setStart(start);
        setEnd(end);
    }

    public Vector2D getCenter() {
        Vector2D v1 = start.scale(.5f);
        Vector2D v2 = end.scale(.5f);

        return v1.add(v2);
    }

    public void rotate(float deg) {
        Vector2D center = getCenter();
        
        start.rotate(deg, center);
        end.rotate(deg, center);
        
        
        
    }


    public void setEnd(Vector2D end) {
        this.end = end;
    }
    public void setStart(Vector2D start) {
        this.start = start;
    }
    public Vector2D getEnd() {
        return end;
    }
    public Vector2D getStart() {
        return start;
    }

}
