////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: RightPanel.java
// Description: *****
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class RightPanel extends JPanel {
  private AddShipPanel addShipPanel; 
  private AnimationPanel animationPanel;
  private JPanel buttons; 
  private JButton showAddShipPanelButton;
  private JButton showAnimationPanelButton; 

  public RightPanel(Model m) {
    setBackground(Color.GRAY);
    // setLayout(new GridLayout(3,1));
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


  /* Operations-Buttons Panel */
    buttons = new JPanel();
    buttons.setLayout(new BoxLayout(buttons,BoxLayout.Y_AXIS));
    buttons.setBackground(Color.GRAY);
    //show addshippanel button 
    showAddShipPanelButton = new JButton("Add Ship");
    buttons.add(showAddShipPanelButton);
    //show/hide animation panel button
    showAnimationPanelButton = new JButton("Show/Hide Animation Panel");
    buttons.add(showAnimationPanelButton); 
    add(buttons);


    // addship Panel
    addShipPanel = new AddShipPanel(m);
    add(addShipPanel);
    addShipPanel.setVisible(false);


    // Animation panel
    animationPanel = new AnimationPanel(m);
    add(animationPanel);
    animationPanel.setVisible(false);




  }

  /*getter funcionts*/
  public AddShipPanel  get_addShipPanel(){
  	return addShipPanel;
  } 
  public JButton  get_showAddShipPanelButton(){
  	return showAddShipPanelButton; 
  }
  
  public AnimationPanel get_animationPanel(){
    return animationPanel;
  }

  public JButton get_showAnimationPanelButton(){
    return showAnimationPanelButton; 
  } 

}
