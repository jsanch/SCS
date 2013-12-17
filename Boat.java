////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Boat.java
// Description:  Extends the Ship class.
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class Boat extends Ship {

	Boat (Point pos){  // constructs a ship with position. 
		  parameters = new ShipParameters();
		  parameters.set_position(pos);
		  //Boat-specific parameters. 
		  parameters.set_shipType(Types.Ship.BOAT);
	    parameters.set_size(new Dimension(50,40)) ; 
	    parameters.set_color(Color.RED);
		}

}