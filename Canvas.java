////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Canvas.java
// Description: Center View Component. Draws the map.
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class Canvas extends JComponent {
  private Model map; 
  
  public Canvas(Model m){
    map = m;
    setBorder (new LineBorder(Color.CYAN, 2));
    setPreferredSize(new Dimension(500,700));
  }

  public void paintComponent (Graphics g) { //is this called when
    // Converts to 2d gaphics.
    Graphics2D g2 = (Graphics2D) g;

    paintBackground(g); // paints the background.
    if (map.get_gridLines()) drawGridLines(g);
    if (map.get_yatchsVisibility()) drawYatchsArea(g2);
    if (map.get_boatsVisibility()) drawBoatsArea(g2);
    if (map.get_subsVisibility()) drawSubsArea(g2);
    

    //store the size of the canvas in the model for other uses. 
    map.set_canvasSize(getSize()); 

  }



  public void drawYatchsArea( Graphics2D g){
      for (Ship s: map.get_ships() ){
          if (s instanceof Yatch){
              s.drawShipArea(g);
          }
      }
  }
  public void drawBoatsArea( Graphics2D g){
      for (Ship s: map.get_ships() ){
          if (s instanceof Boat){
              s.drawShipArea(g);
          }
      }
  }
  public void drawSubsArea( Graphics2D g){
      for (Ship s: map.get_ships() ){
          if (s instanceof Sub){
              s.drawShipArea(g);
          }
      }
  }


  public void drawGridLines (Graphics g){
    Dimension size = getSize();
    for (int i = 0; i< size.width; i++){
      g.setColor(Color.BLACK);
      g.drawLine (i*20, 0, i*20, size.height);
      g.drawLine (0, i*20, size.width, i*20);
    }
  }


  private void paintBackground(Graphics g){ //for use within class. 
    if (map.get_bgColor() == Types.BackgroundColor.GREEN) {
      g.setColor(new Color(47,79,79)); //dark green. 
      g.fillRect(0, 0, getWidth(), getHeight());
    }
    else {
      g.setColor(Color.WHITE); 
      g.fillRect(0, 0, getWidth(), getHeight());
    }
  }





}
