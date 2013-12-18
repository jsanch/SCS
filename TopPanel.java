////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: TopPanel.java
// Description: *****
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {
  private ShipViewsPanel viewsPanel; 
  private Model map;
  public TopPanel(Model m) {
    map = m; 
    setBackground(Color.GRAY);
    //select ship types to display in the map 
    viewsPanel  = new ShipViewsPanel(map);
    add(viewsPanel);
  }
  
  public ShipViewsPanel get_viewsPanel(){
  	return viewsPanel;
  }

}





