package planetDefender;


import planetDefender.gui.*;

import math.Vector2D;
import math.primitives.Line2D;
import planetDefender.logic.Cannon;

public class Main {

    public static void main(String[] args) {

            
            Window w = new Window();
            Canvas c = new Canvas();
            Vector2D v = new Vector2D(200, 200);
            Vector2D v2 = new Vector2D(100, 100);
            Line2D l1 = new Line2D(v, v2);
            Line2D l2 = new Line2D(new Vector2D(100, 100), new Vector2D(200, 200));

            c.addLine(l2);
            //c.addLine(l1);
            //v.rotate(90, new Vector2D(250, 250));
            w.add(c);
        

        

        // Cannon c1 = new Cannon(150, 100);
        // System.out.println(c1);
        //c1.rotate(90, new Vector2D(100, 100));
        // c1.rotateAroundPlanet(100, 200);
        // System.out.println(c1);

        // Vector2D v1 = new Vector2D(200, 200);
        // Vector2D v2 = new Vector2D(100, 100);
        // System.out.println(v1);
        // v1.rotate(90);
        // System.out.println(v1);
    }

}
