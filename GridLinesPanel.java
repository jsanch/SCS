////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: GridLinesPanel.java
// Description: JPanel to toogle the Background. 
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLinesPanel extends JPanel {
	private JLabel title; 
  private JCheckBox gridCB;
	
	public GridLinesPanel(Model map){
	
  	// create view elements. 
    gridCB = new JCheckBox("Show/Hide Grid lines.");
    add(gridCB);

    // get default vlaue from Model (map); 
    gridCB.setSelected(map.get_gridLines());
	}

  public JCheckBox get_gridCB(){
    return gridCB;
  }

}

