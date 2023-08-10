package planetDefender.gui;

import java.awt.Component;
import java.awt.Dimension;

import planetDefender.gui.Canvas;

import javax.swing.JComponent;
import javax.swing.JFrame;

import math.Vector2D;

public class Window extends JFrame{



    public Window() {
        setDefaultCloseOperation(3);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    @Override
    public Component add(Component c) {
        super.add(c);
        pack();
        setLocationRelativeTo(null);
        return c;
    }
}       
