////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Controller.java
// Description: Listens to user input and alters the Model.
// 				Manipulates the Model
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.Timer;



public class Controller implements  ChangeListener, ActionListener, ItemListener {
  // key elements of the Controller:
  private Model map; // the map is where data is stored. 
  private View view;  //the view is where all the widgters and panels are.
  private Timer timer;
  
  public Controller (Model m, View v) {
    map = m; 
    view = v; 
    timer = new Timer(100,this);
    add_BackgroundActionListener(this); //Background Listener.
    add_GridLineListener(this);         //GridLines Listener. 
    add_ShipViewsListener(this); // show/hide ships
    add_addShipListeners(this,this); //add ship
    add_AnimationPanelListeners(this,this); //add animation.   
  }

  //listens for all actions.
  @Override
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource(); //get the source of the object. 
/* TOGGLE BACKGROUND */ 
    // green radio button 
    if (src == view.get_bottomPanel().get_bgPanel().get_rbGreen() ){
      map.changeBackgroundColor(Types.BackgroundColor.GREEN);
      System.out.println("Change background to green");
    }
    // white radio button 
    if (src == view.get_bottomPanel().get_bgPanel().get_rbWhite() ){
      map.changeBackgroundColor(Types.BackgroundColor.WHITE);
      System.out.println("Change background to white");
    }
/* SHOW / HIDE  GRID LINES */ 
    // show/hide grid lines checkbox
    if (src == view.get_bottomPanel().get_glPanel().get_gridCB() ){
      boolean b = view.get_bottomPanel().get_glPanel().get_gridCB().isSelected();
        map.set_gridLines(b);
    }
    
/* ADD SHIP */
    //Show the addShipPanel. 
    if (src == view.get_rightPanel().get_showAddShipPanelButton() ){
      //set  the  visibility of the JPanel
      view.get_rightPanel().get_addShipPanel().setVisible(true); 
      //refresh the JPanel.
      view.get_rightPanel().get_addShipPanel().refresh();
      // disable the add ship button. 
      view.get_rightPanel().get_showAddShipPanelButton().setEnabled(false);
    }
    //Collect Ship type parameter. 
    if (src == view.get_rightPanel().get_addShipPanel().get_rbBoat()){
      map.get_tempShipParams().set_shipType(Types.Ship.BOAT); 
    }
    if (src == view.get_rightPanel().get_addShipPanel().get_rbYatch()){
      map.get_tempShipParams().set_shipType(Types.Ship.YATCH); 
    }
    if (src == view.get_rightPanel().get_addShipPanel().get_rbSub()){
      map.get_tempShipParams().set_shipType(Types.Ship.SUB); 
    }
    //Colect Direction parameter. 
    if (src == view.get_rightPanel().get_addShipPanel().get_rbNorth()){
      map.get_tempShipParams().set_direction(Types.Direction.NORTH);
    }
    if (src == view.get_rightPanel().get_addShipPanel().get_rbSouth()){
      map.get_tempShipParams().set_direction(Types.Direction.SOUTH);
    }
    if (src == view.get_rightPanel().get_addShipPanel().get_rbEast()){
      map.get_tempShipParams().set_direction(Types.Direction.EAST);
    }
    if (src == view.get_rightPanel().get_addShipPanel().get_rbWest()){
      map.get_tempShipParams().set_direction(Types.Direction.WEST);
    }
    //ADD Button wihtin addShip JPanel. 
    if (src == view.get_rightPanel().get_addShipPanel().get_addShipButton() ) {
      //get the x, y from thev view (in the JSliders) 
      int x = view.get_rightPanel().get_addShipPanel().get_xPosition().getValue();
      int y = view.get_rightPanel().get_addShipPanel().get_yPosition().getValue();
      Point position = new Point(x,y);
      //get the ship type from the radio buttons. 
      Types.Ship type = view.get_rightPanel().get_addShipPanel().get_selectedType();
      //get the ship Direction from the dir radio buttons. 
      Types.Direction direction = view.get_rightPanel().get_addShipPanel().get_selectedDirection();
      //add the ship.  
      map.addShip(type,position,direction);
      // then after ship is added, hide the Jpanel and enable add ship again.
      view.get_rightPanel().get_addShipPanel().setVisible(false); 
      view.get_rightPanel().get_showAddShipPanelButton().setEnabled(true);
    }

/*ANIMATION*/
    //show/hide the Animation Panel
    if (src == view.get_rightPanel().get_showAnimationPanelButton()){
      // set the visibility of the Animataion JPanel
      if ( view.get_rightPanel().get_animationPanel().isVisible() == true) 
        view.get_rightPanel().get_animationPanel().setVisible(false);
      else 
        view.get_rightPanel().get_animationPanel().setVisible(true);
    }
    if (src == view.get_rightPanel().get_animationPanel().get_startButton()){
      timer.start();
    }
    if (src == view.get_rightPanel().get_animationPanel().get_stopButton()){
      timer.stop();
    }
    if (src == timer){
      map.moveAllShips(view.get_rightPanel().get_animationPanel().get_speed());
    }

    //after any/every,  REFRESH the VIEW
    view.refresh(); //repaints canvas, revalidates window
  }

  // listens for change events
  @Override
  public void stateChanged(ChangeEvent e){
    Object src = e.getSource();
    int xpos,ypos,speed;
    /* Add Ship Position Parameters */ 
    if ( src == view.get_rightPanel().get_addShipPanel().get_xPosition()){
      JSlider slider = (JSlider) src; // tranforming objrct to get its 
      xpos = slider.getValue();// get value from gui slider
      //display the position in the view. 
      view.get_rightPanel().get_addShipPanel().set_xPositionDisplay(xpos);
    }
    if ( src == view.get_rightPanel().get_addShipPanel().get_yPosition()){
      JSlider slider = (JSlider) src; // tranforming objrct to get its value
      ypos = slider.getValue();// get value from gui slider
      //display the position in the view. 
      view.get_rightPanel().get_addShipPanel().set_yPositionDisplay(ypos);
    } 
    if (src == view.get_rightPanel().get_animationPanel().get_speedSlider()){
      JSlider slider = (JSlider) src; 
      speed  = slider.getValue(); 
      view.get_rightPanel().get_animationPanel().set_speedDisplay(speed);

    }
    view.refresh(); 
  }
  //listens for changed items. 
  @Override
  public void itemStateChanged(ItemEvent e){
  /* SHIP VIEWS PANEL - 'select which ships to display' */ 
    JCheckBox cb = (JCheckBox)e.getItem();
    if( cb.getText() == "Yatch"){
      map.set_subsVisibility(cb.isSelected());
    }
    if( cb.getText() == "Submarines"){
      map.set_yatchsVisibility(cb.isSelected());
    }
    if( cb.getText() == "Boats"){
      map.set_boatsVisibility(cb.isSelected());
    }
    //refresh after any change. 
    view.refresh();
  }


  //add listeners to the ToogleBackgroundPanel 
  public void add_BackgroundActionListener (ActionListener ae){
    view.get_bottomPanel().get_bgPanel().get_rbGreen().addActionListener(ae);
    view.get_bottomPanel().get_bgPanel().get_rbWhite().addActionListener(ae);
  } 

  //add listener to the GridLinesPanel 
  public void add_GridLineListener(ActionListener ae){
    view.get_bottomPanel().get_glPanel().get_gridCB().addActionListener(ae);
  }
  public void add_addShipListeners(ActionListener ae, ChangeListener ce){
    view.get_rightPanel().get_showAddShipPanelButton().addActionListener(ae);
    view.get_rightPanel().get_addShipPanel().get_addShipButton().addActionListener(ae);
    view.get_rightPanel().get_addShipPanel().get_xPosition().addChangeListener(ce);
    view.get_rightPanel().get_addShipPanel().get_yPosition().addChangeListener(ce);
  }

  // listenr for the ShipViewsPanel  checkboxes
  public void add_ShipViewsListener(ItemListener i){
    view.get_topPanel().get_viewsPanel().get_subCB().addItemListener(i);
    view.get_topPanel().get_viewsPanel().get_yatchCB().addItemListener(i);
    view.get_topPanel().get_viewsPanel().get_boatCB().addItemListener(i);
  }

  public void add_AnimationPanelListeners(ActionListener ae , ChangeListener ce){
    view.get_rightPanel().get_showAnimationPanelButton().addActionListener(ae);
    view.get_rightPanel().get_animationPanel().get_startButton().addActionListener(ae);
    view.get_rightPanel().get_animationPanel().get_stopButton().addActionListener(ae);
    view.get_rightPanel().get_animationPanel().get_speedSlider().addChangeListener(ce);
  }



}
