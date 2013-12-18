////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Model.java
// Description: a.k.a map. Contains the Application Data and Logic.
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class Model {
  // DATA 
  private Dimension canvasSize;
  private ArrayList<Ship> ships;  
	private Types.BackgroundColor bgColor;
	private boolean gridLines; 
  private ShipParameters tempShipParams; // used to store ship params.
  private boolean boatsVisibility;  //ship visibility
  private boolean yatchsVisibility;
  private boolean subsVisibility;



	public Model() {
    ships = new ArrayList<Ship> (); // array of ships. 
    //default parameters
		bgColor = Types.BackgroundColor.GREEN; 
    gridLines = true;  		
    boatsVisibility = true;
    yatchsVisibility = true;
    subsVisibility = true;

	}

	public void changeBackgroundColor(Types.BackgroundColor c){
		bgColor = c; 
	}

	public boolean addShip(Types.Ship type, Point position,Types.Direction direction){
    Ship newShip;
    if (type == Types.Ship.BOAT) {
      newShip = new Boat(position);
    } else if (type == Types.Ship.YATCH) {
      newShip = new Yatch(position);
    } else if (type == Types.Ship.SUB){
      newShip = new Sub(position);
    } else {
        System.out.println ( " Must specify ShipType");
        return false;
    }
    newShip.set_direction(direction);
    ships.add(newShip);
    return true;
	}

  public boolean moveAllShips(int speed){
    for (int i=0; i<ships.size(); i++)
      ships.get(i).move(speed);
    return true;
  }

  /* Setter Methods */ 
  public void set_canvasSize(Dimension d){
    canvasSize = d;
  }
  public void set_gridLines(boolean b){
    gridLines = b;
  }

  public void set_tempShipParams(ShipParameters p){
    tempShipParams = p;
  }

  public void set_boatsVisibility(boolean b){
    boatsVisibility = b; 
  }
  public void set_yatchsVisibility(boolean b){
    yatchsVisibility = b; 
  }
  public void set_subsVisibility(boolean b){
    subsVisibility = b;
  }

  /* Getter Methods */
  public Dimension get_canvasSize(){
    return canvasSize; 
  }

  public Types.BackgroundColor get_bgColor(){
    return bgColor;
  }

  public ArrayList<Ship> get_ships(){
    return ships;
  }
  public boolean get_gridLines(){
    return gridLines;
  }

  public ShipParameters get_tempShipParams(){
    return tempShipParams;
  }

  public boolean get_boatsVisibility(){
    return boatsVisibility;
  }
  public boolean get_yatchsVisibility(){
    return yatchsVisibility;
  }
  public boolean get_subsVisibility(){
    return subsVisibility;
  }

}
