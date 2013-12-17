////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: ShipViewsPanel.java
// Description: JPanel to toogle the Background. 
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShipViewsPanel extends JPanel {
	private JLabel label; 
  private JCheckBox subCB; 
  private JCheckBox yatchCB;
  private JCheckBox boatCB;

  public ShipViewsPanel(Model m) {
    setLayout ( new GridLayout(1,5));
    // setBackground(Color.GRAY);

    // Create a  label
    label = new JLabel ("Show/Select Ships:");

    // Create  CheckBoxes.
    subCB = new JCheckBox ("Submarines", true);
    yatchCB = new JCheckBox ("Yatch", true);
    boatCB = new JCheckBox ("Boats", true);

    // Add the elements to the panel.
    add (label);
    add (subCB);
    add (yatchCB);
    add (boatCB);
	}

  /* getter methods */ 
  public JCheckBox get_subCB(){
    return subCB;
  } 
  public JCheckBox get_yatchCB(){
    return yatchCB;
  }
  public JCheckBox get_boatCB(){
    return boatCB;
  }

}