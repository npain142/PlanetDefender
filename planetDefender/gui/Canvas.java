package planetDefender.gui;

import java.awt.Dimension;
import java.awt.Graphics;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.Line;
import javax.swing.JPanel;

import math.Vector2D;
import math.primitives.Line2D;

public class Canvas extends JPanel {
    ArrayList<Line2D> lines = new ArrayList<>();
    int counter = 1;

    public Canvas() {
        this.setPreferredSize(new Dimension(500, 500));
        Timer t = new Timer();
            TimerTask task = new TimerTask() {

                @Override
                public void run() {
                    
                    repaint();
                }
                
            };
        t.scheduleAtFixedRate(task, 100, 1);    
    }

    public void addLine(Line2D line) {
        Vector2D start = new Vector2D(line.getStart().getX(), getPreferredSize().height - line.getStart().getY());
        Vector2D end = new Vector2D(line.getEnd().getX(), getPreferredSize().height - line.getEnd().getY());
        lines.add(new Line2D(start, end));
        
    }

     
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (Line2D l : lines) {
            g.fillOval( (int)l.getStart().getX() - 5, (int) l.getStart().getY() - 5, 10, 10);
            g.drawLine((int)l.getStart().getX(), (int) l.getStart().getY(), (int) l.getEnd().getX(), (int) l.getEnd().getY());
            l.rotate(1);
        }
        
        
    }

}
