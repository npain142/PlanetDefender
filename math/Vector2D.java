package math;


import planetDefender.gui.Planet;

import javax.print.attribute.standard.Finishings;

public class Vector2D {

    private float x, y;
    private Vector2D translationVector = null;


    public Vector2D(float x, float y) {
        setX(x);
        setY(y);
    }

    public void setLength(float l) {
        
    }
    public float getLength() {
        return (float) Math.sqrt(x*x + y*y);
    }

    public void translate(float x, float y) {
        setTranslationVector(new Vector2D(x, y));
        setX(getX());
        setY(getY());
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(v.getX() + getX(), v.getY() + getY());
    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(getX() - v.getX(), getY() - v.getY());
    }
    public Vector2D scale(float scaleFactor) {
        return new Vector2D(getX() * scaleFactor, getY() * scaleFactor);
    } 
    public void rotate(double deg) {
        double radiant = Math.toRadians(deg);
        
        float x = (float) (getX() * Math.cos(radiant) - getY() * Math.sin(radiant));
        float y = (float) (getX() * Math.sin(radiant) + getY() * Math.cos(radiant));

        

        setX(x);
        setY(y);
    }

    public void rotate(float x, float y) {
        Vector2D v = new Vector2D(x, y);

        double nenner = (v.getLength() * this.getLength());
        if (nenner == 0)
            nenner = .1;


        double Vx = (this.scalarProduct(v))/nenner;

        

        double deg = Math.acos(Vx);
        deg = Math.toDegrees(deg);
        rotate(deg);
    }

    public void rotate(float x, float y, Vector2D anchor, boolean n) {


        Vector2D v = new Vector2D(x, y);
        Vector2D centerA = this.sub(anchor);
        Vector2D centerB = v.sub(anchor);

        for (float i = .01f; i <= 1; i+=.01) {
            if (this.scale(i).equals(v))return;
        }


        double Vx = (centerA.scalarProduct(centerB))/(centerA.getLength()*centerB.getLength());

        if (Vx == 0 || Double.isNaN(Vx)) {
            return;
        }


        double s = Math.cos(Vx);
        double deg = Math.acos(Vx);


        deg = Math.toDegrees(deg);

        if (n)
            deg = -deg;
        //double deg = Math.acos(Vx);
        System.out.println(deg);


        if (Double.isNaN(deg))
            return;

        rotate(-deg, anchor);
    }


    public void rotate(double deg, Vector2D anchor) {
        Vector2D s = this.sub(anchor);
        s.rotate(deg);
        Vector2D p = anchor.add(s);

        setX(p.getX());
        setY(p.getY());
    }

    public void setX(float x) {
        if (translationVector != null) {
            this.x = x + translationVector.getX();
        } else {
            this.x = x;
        }
    }
    public void setY(float y) {
        if (translationVector != null) {
            this.y = y + translationVector.getY();
        } else {
            this.y = y;
        }

    }
    public float scalarProduct(Vector2D v) {

        return getX()*v.getX() + getY()*v.getY();

    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    private void setTranslationVector(Vector2D v) {
        this.translationVector = v;
    }

    @Override
    public String toString() {

        return getClass() + " [ " + getX() + ", " + getY() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            Vector2D v = (Vector2D) obj;
            return v.getX() == this.getX() && v.getY() == this.getY();
        }
        return false;
    }
}
