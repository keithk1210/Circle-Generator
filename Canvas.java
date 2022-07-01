import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Canvas extends JPanel {

    int width, height;

    int rows;

    int cols;

     int rowHt;

     int rowWid;
    
    int diameter;


    
  public Canvas(int w, int h, int diameter) {
    setSize(width = w, height = h);
    
    this.diameter = diameter;
    rows = this.diameter;
    cols = this.diameter;
    this.rowHt = this.height / (rows);
    this.rowWid = this.width / (rows);
  }

  public int getRowHt() {
    return this.rowHt;
  }

  public int getRowWid() {
    return this.rowWid;
  }

  @Override
  public void paint(Graphics g) {
    int i;
    width = getSize().width;
    height = getSize().height;

    // draw the rows
    for (i = 0; i < rows; i++) {
      g.drawLine(0, i * rowHt, width, i * rowHt);
    }

    // draw the columns
    for (i = 0; i < cols; i++) {
      g.drawLine(i * rowWid, 0, i * rowWid, height);
    }

      //draw circle


    double centerX = this.diameter / 2.0;
    double centerY = this.diameter / 2.0;

    System.out.println("Center coords: " + centerX + ", " + centerY);
    for (int d = 1, index = 0; d <= this.diameter; d += 2) {
      System.out.println("D is: " + d);
      for (int x = 0; x < this.rows; x++) {
          for (int y = 0; y < this.cols; y++) {
              double distance = Math.hypot(Math.abs(x + .5 - centerX),Math.abs(y + .5 - centerY));
              System.out.println("Distance from " + centerX + ", " + centerY + " to " + x + ", " + y + " is " + distance);
              if (Math.abs(distance - (d/ 2.0)) <= 0.5) {
                   
                    g.setColor(Resources.colors[index]);
                    g.fillRect(x * rowWid, y * rowHt, rowWid, rowHt);
              }
          }
      }
      index = (index + 1 > 5) ? 0: index + 1;
    }
      
    }
  }

  


