////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Controller_ChangeListener.java
// Description: Listens to user input and alters the Model.
// 				Manipulates the Model
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;
// import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
// import java.awt.event.*;
// import javax.swing.event; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Controller_ChangeListener implements  ChangeListener {
  private Model map;
  private View view;
  
  public Controller_ChangeListener (Model m, View v) {
    map = m; 
    view = v; 
    add_PositionSlidersListener(this);
  
  }

 // listens for Changed states. 
  // @Override
  public void stateChanged(ChangeEvent e){
      System.out.println("wwwwww");
  }
  // add change listeners for the Position Sliders.   
  public void add_PositionSlidersListener(ChangeListener ce){
    view.get_rightPanel().get_addShipPanel().get_xPosition().addChangeListener(ce);
    view.get_rightPanel().get_addShipPanel().get_yPosition().addChangeListener(ce);
  }

}
