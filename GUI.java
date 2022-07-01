import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Dimension;

public class GUI {

    JFrame frame;
    Canvas panel;
    int width;

    public GUI(int diameter) {

        this.frame = new JFrame("Circle test");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        
    
        this.panel = new Canvas(Resources.SCREEN_HEIGHT,Resources.SCREEN_HEIGHT,diameter);

        this.frame.setBounds(70,70,0,0);


        this.panel.setPreferredSize(new Dimension(this.panel.getRowWid() * diameter, this.panel.getRowHt() * diameter));  
        this.panel.setFocusable(true);
        this.panel.requestFocusInWindow();
        
        this.frame.setContentPane(this.panel);
        this.frame.pack();
        this.frame.setVisible(true);
        

    }

    
}
