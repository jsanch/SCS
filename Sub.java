////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Sub.java
// Description:  Extends the Ship class.
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class Sub extends Ship {

	Sub (Point pos){ // consttructor with position .
		parameters = new ShipParameters();
		parameters.set_position(pos);
		// Sub-specific parameters. 
		parameters.set_shipType(Types.Ship.SUB);
		parameters.set_size( new Dimension(70,20));
	  parameters.set_color(Color.BLUE);
	}

}