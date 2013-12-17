////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: ToogleBackgroundPanel.java
// Description: JPanel to toogle the Background. 
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToogleBackgroundPanel extends JPanel {
	private JLabel title; 
  private JRadioButton rbGreen; 
  private JRadioButton rbWhite;
  private ButtonGroup rbGroup;

  public ToogleBackgroundPanel(Model m) {
      // view elements. 
      title = new JLabel ("Toggle Background: "); 
			add(title);
      
      rbGreen = new JRadioButton ("Green"); 
			add(rbGreen);
      
      rbWhite = new JRadioButton ("White");
      add(rbWhite);
      
      rbGroup = new ButtonGroup(); 
      rbGroup.add(rbGreen);
      rbGroup.add(rbWhite);

      //Acces the Model(map) for default selected radio button.  
      if (m.get_bgColor() == Types.BackgroundColor.GREEN) 
        rbGreen.setSelected(true);
      else 
        rbWhite.setSelected(true);

	}

  /* getter methods */ 
  public JRadioButton get_rbGreen(){
    return rbGreen;
  }
  public JRadioButton get_rbWhite(){
    return rbWhite;
  }

}