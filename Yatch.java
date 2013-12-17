////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Yatch.java
// Description:  Extends the Ship class.
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class Yatch extends Ship {


	Yatch (Point pos){ // consttructor with position .
		parameters = new ShipParameters();
		parameters.set_position(pos);
		//parameters specific to ship type: 
		parameters.set_color(Color.YELLOW);
	  parameters.set_size(new Dimension(30,25));
	  parameters.set_shipType(Types.Ship.YATCH);

	}

}