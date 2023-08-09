package planetDefender;


import math.Vector2D;
import planetDefender.logic.Cannon;

public class Main {

    public static void main(String[] args) {

        Cannon c1 = new Cannon(100, 150);
        System.out.println(c1);
        c1.rotateAroundPlanet(0, 100);
        System.out.println(c1);

        /*Vector2D v1 = new Vector2D(100, 150);
        Vector2D v2 = new Vector2D(100, 100);
        System.out.println(v1);
        v1.rotate(90, v2);
        System.out.println(v1);*/
    }

}
