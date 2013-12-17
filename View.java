////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: View.java
// Description: Creates/ has elements of the user interface.
//              Updates the View. 
////////////////////////////////////////////////////////////////////////////////


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.SwingUtilities;


public class View {
  //View's Elements  *** miight want to change to private afterwards. 
  private Model map;
  private JFrame window;
  private Canvas canvas;
  private TopPanel topPanel;
  private BottomPanel bottomPanel;
  private LeftPanel leftPanel;
  private RightPanel rightPanel;
  private Container windowContentPane;


  //** Class constructor. Creates all the elemnts of the view.
  public View(Model map){
    // Model. View updates using the info from the model. 
    setModel(map);

    // Window (JFrame)
    window = new JFrame();
    window.setTitle ("Ship Control System");
    window.setSize(1500,1000);
    window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    // Window's Container (Container)
    windowContentPane = window.getContentPane();
    windowContentPane.setLayout (new BorderLayout());


    // Canvas (JComponent). Draws the map.
    canvas = new Canvas(map);
    windowContentPane.add(canvas, BorderLayout.CENTER);


    // Control Panels (JPanels). The interact with the model (map).
    topPanel  = new TopPanel(map);
    windowContentPane.add(topPanel,BorderLayout.NORTH);
    bottomPanel = new BottomPanel(map);
    windowContentPane.add(bottomPanel, BorderLayout.SOUTH);
    leftPanel  = new LeftPanel(map);
    windowContentPane.add(leftPanel,BorderLayout.WEST);
    rightPanel = new RightPanel(map);
    windowContentPane.add(rightPanel, BorderLayout.EAST);


    //showing the window.
    window.setVisible(true);

  }

  public void refresh(){
    window.revalidate();
    canvas.repaint();  
    rightPanel.get_addShipPanel().refresh();
  }

/* setter methods */ 
  public void setModel (Model m){  //the model contains key elements
    map = m;                        // that tell the view what to draw. 
  }


/* getter functions */ 
  public JFrame get_window(){
    return window;
  }
  public Canvas get_canvas(){
    return canvas;
  }
  public TopPanel get_topPanel(){
    return topPanel;
  }
  public BottomPanel get_bottomPanel(){
    return bottomPanel;
  }
  public LeftPanel get_leftPanel(){
    return leftPanel;
  }
  public RightPanel get_rightPanel(){
    return rightPanel;
  }


}
