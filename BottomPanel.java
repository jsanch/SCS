////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: BottomPanel.java
// Description: Handles views.
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class BottomPanel extends JPanel {
  private ToogleBackgroundPanel bgPanel; // Chages Background. 
  private GridLinesPanel glPanel; //togles grid lines in map. 
  
  public BottomPanel(Model m) {
    setBackground(Color.GRAY);
    setLayout (new FlowLayout());
    //background jpanel. 
    bgPanel = new ToogleBackgroundPanel(m);
	  add(bgPanel);    
    //gridlines Jpanel
    glPanel = new GridLinesPanel(m);
    add(glPanel);

  }

  /*getter methods*/
  public ToogleBackgroundPanel get_bgPanel(){
    return bgPanel;
  }
  public GridLinesPanel get_glPanel(){
    return glPanel;
  }


}

