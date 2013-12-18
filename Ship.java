////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Ship.java
// Description: Abstract class for ship objects. 
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public abstract class Ship {

  protected ShipParameters parameters; // position, speed, etc
  static protected int shipID = 0;  // to identify ship. 
 

/* Abstract Ship Methods */ 
  // public abstract void drawShip(Graphics2D g);
  

/* General Ship Methods */ 
  public void move(int speed){
    if (this.parameters.get_direction() == Types.Direction.NORTH)
      parameters.get_position().translate(0,speed);
    if (this.parameters.get_direction() == Types.Direction.SOUTH)
      parameters.get_position().translate(0,-speed);
    if (this.parameters.get_direction() == Types.Direction.EAST)
      parameters.get_position().translate(speed,0);
    if (this.parameters.get_direction() == Types.Direction.WEST)
      parameters.get_position().translate(-speed,0); 
  }

  //draws a rectangular area around the ship. 
  public  void drawShipArea(Graphics2D g){
    g.setColor(parameters.get_color());
    Rectangle area = new Rectangle(parameters.get_position(),parameters.get_size());
    g.draw (area);
  }
  //draws ship id next to ship. 
  public void drawID(Graphics2D g, int id){
    String idstring = Integer.toString(id);
    String str = "ship" + idstring;
    int xcord = (int) parameters.get_position().getX();
    int ycord = (int) parameters.get_position().getY();
    g.drawString(str,xcord,ycord);
  }

/* setter methods */ 
  public void set_parameters(ShipParameters sp){
    parameters = sp; 
  }
  public void set_position(Point p){
    parameters.set_position(p);
  }
  public void set_direction(Types.Direction d){
    parameters.set_direction(d);
  }
/* getter methods */ 
  public ShipParameters get_parameters(){
    return parameters; 
  }

}