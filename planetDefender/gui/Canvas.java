package planetDefender.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import math.Vector2D;
import math.primitives.Line2D;

public class Canvas extends JPanel implements MouseMotionListener{
    int counter = 1;
    Cannon cannon = new Cannon(Planet.center.add(new Vector2D(20, 20)), Planet.center.add(new Vector2D(100, 100)));
    public static Dimension dim = new Dimension(500, 500);
    Vector2D v = new Vector2D(350, 350);
    public Vector2D lastPoint;
    public Canvas() {
        this.setPreferredSize(dim);
        addMouseMotionListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(250 - 12, 250 -12, 25, 25);
        g.drawLine((int) cannon.getStart().getX(), (int) cannon.getStart().getY(), (int) cannon.getEnd().getX(), (int) cannon.getEnd().getY());
        
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {


    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
            /*Vector2D nV = new Vector2D(e.getX(), e.getY());
            Vector2D v = nV.sub(cannon.getStart());
            float len = v.getLength();
            float x = 50/len;
            System.out.println(v.scale(x).add(cannon.getStart()));
            System.out.println("Length: " + len);
            System.out.println("factor " + x);
            
            cannon.setEnd(v.scale(x).add(cannon.getStart()));
            
            repaint();*/

            /*Vector2D v = cannon.getEnd().sub(cannon.getStart());
            v.rotate(e.getX(), e.getY());

            cannon.setEnd(cannon.getStart().add(v));
            */
            double x = 1;
            boolean backwards = false;
            if (lastPoint != null) {


                if (e.getX() < Planet.center.getX()) {
                    if (e.getY() < lastPoint.getY() ) {
                        backwards = true;
                    }

                } else if (e.getX() > Planet.center.getX()){
                    if (e.getY() > lastPoint.getY() ) {
                        backwards = true;
                    }
                }


                if (e.getY() > Planet.center.getY()) {
                    if (e.getX() < lastPoint.getX() ) {
                        backwards = true;
                    }
                } else if (e.getY() < Planet.center.getY()){
                    if (e.getX() > lastPoint.getX() ) {
                        backwards = true;
                    }
                }

            }


            cannon.rotate((float)(e.getX()), (float)(e.getY()), backwards);
            lastPoint = new Vector2D(e.getX(), e.getY());
            //cannon.rotate(e.getX(), e.getY());

            repaint();



    }

}
