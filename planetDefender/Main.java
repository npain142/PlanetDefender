package planetDefender;


import planetDefender.gui.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import math.Vector2D;
import math.primitives.Line2D;
import planetDefender.logic.Cannon;

public class Main {
        static Line2D l2 = new Line2D(new Vector2D(100, 100), new Vector2D(200, 200));
        static Canvas c = new Canvas();
    public static void main(String[] args) {
            
            
            Window w = new Window();
            
            Vector2D v = new Vector2D(200, 200);
            Vector2D v2 = new Vector2D(100, 100);
            Line2D l1 = new Line2D(v, v2);

            Timer t = new Timer();
            
            
            w.add(c);
            // TimerTask task = new TimerTask() {

            //     @Override
            //     public void run() {
                    
            //         c.lines.clear();
            //         l2.rotate(1, 0);
            //         c.addLine(l2);
                    
            //         c.repaint();
            //     }
                
            // };
        
            //t.scheduleAtFixedRate(task, 1000, 750);
        // Cannon c1 = new Cannon(150, 100);
        // System.out.println(c1);
        //c1.rotate(90, new Vector2D(100, 100));
        // c1.rotateAroundPlanet(100, 200);
        // System.out.println(c1);

        // Vector2D v1 = new Vector2D(100, 100);
        // Vector2D v2 = new Vector2D(200, 200);
        // Vector2D v3 = v2.sub(v1);
        // System.out.println(v1);
        // v1.rotate(90,  new Vector2D(200, 200));
        // System.out.println(v1);
    }


    
}
