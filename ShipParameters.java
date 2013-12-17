////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: ShipParameters.java
// Description: holds the parameters of a ship. 
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ShipParameters{ 
  private Point position; // x and y position. 
  private int xpos;
  private int ypos; 
  private Dimension size; // height and width. 
  private Types.Direction direction; //NORTH,SOUTH,WEST,EAST
  private int speed;  
  private Types.Ship shipType; 
  private Color color; // each subclass has its own color. 
  private String textlabel; // each subclass has its 

  public ShipParameters(){
    // INITIALIZE WITH 'NULL VALES'; 
    position  = new Point(0,0);
    xpos = 0;
    ypos = 0; 
    shipType = Types.Ship.BOAT; 
    // direction = new Types.Direction();
    // speed     = new Int(); 
    // shipType  = new Types.Ship(Types.Ship.NULL); 
    // color     = new Color(Color.GRAY);
  }

  /*setter methods */ 
  public void set_position(Point p){
    // System.out.println("set position was called");

    // System.out.println(p);

  	position = p; 
  }
  public void set_size(Dimension s){
  	size =s; 
  }
  public void set_direction(Types.Direction d ){
  	direction = d; 
  }
  public void set_speed(int s){
  	speed = s ; 
  }

  public void set_shipType(Types.Ship t){
    shipType = t; 
  }

  public void set_color(Color c){
     color = c;
  }
  public void set_textlabel(String t){
    textlabel = t; 
  } 
  public void set_xpos(int x){
    xpos = x;
  }
  public void set_ypos(int y){
    ypos = y; 
  }

  /* getter methods */ 
  public Point get_position() {
  	return position;
  }  
  public Dimension get_size() {
  	return size;
  } 
  public Types.Direction get_direction() {
  	return direction;
  }
  public int get_speed() {
  	return speed; 
  }
  public Types.Ship get_shipType () {
    return shipType;
  }
  public Color get_color(){
    return color;
  }
  public String get_textlabel(){
    return textlabel; 
  } 

  public int get_xpos(){
    return xpos;
  }
  public int get_ypos(){
    return ypos;
  }

}