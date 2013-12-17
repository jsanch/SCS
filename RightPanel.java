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
  private JButton showAddShipPanelButton;
  private JButton showAnimationPanelButton; 

  public RightPanel(Model m) {
    setBackground(Color.GRAY);
    setLayout(new GridLayout(4,1));

    //show addshippanel button 
    showAddShipPanelButton = new JButton("Add Ship");
    add(showAddShipPanelButton);
    // addship Panel
    addShipPanel = new AddShipPanel(m);
    add(addShipPanel);
    addShipPanel.setVisible(false);

    //show/hide animation panel button
    showAnimationPanelButton = new JButton("Show/Hide Animation Panel");
    add(showAnimationPanelButton); 
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
