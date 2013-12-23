////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: AddShipPanel.java
// Description: *****
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class AddShipPanel extends JPanel {
	// model. 
  private Model map;

  // Panel elements
  //add button. 
 	private JButton addShipButton;
  private JPanel addPanel;
  //position. 
  private JLabel positionLabel;
 	private JSlider xPosition;
 	private JSlider yPosition;
 	private JLabel xLabel;
	private JLabel yLabel;
	private JLabel xPositionDisplay;
	private JLabel yPositionDisplay;
  // type
  private JLabel shipTypeLabel;
  private JRadioButton rbBoat;
  private JRadioButton rbYatch;
  private JRadioButton rbSub;
  // Direction
  private JLabel directionLabel; 
  private JRadioButton rbNorth ;
  private JRadioButton rbSouth;
  private JRadioButton  rbEast;
  private JRadioButton rbWest;

 	//default canvasmax size 
	private int xMaxSize = 1000; 
	private int yMaxSize = 1000; 

 	public AddShipPanel(Model m){
    map = m; 
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    setBackground(Color.MAGENTA);

 	/*ADD SHIP PARAMETERS */ 
		/* POSITION */ 
    JPanel positionPanel = new JPanel();
    positionPanel.setLayout(new BoxLayout(positionPanel,BoxLayout.Y_AXIS));
    positionPanel.setBackground(Color.MAGENTA);
 		//creating position widgets. 
    positionLabel = new JLabel ("Position:");
 		xLabel  = new JLabel("x:");
 		yLabel  = new JLabel("y:");
		xPosition = new JSlider(JSlider.HORIZONTAL,0,xMaxSize,1);
		yPosition = new JSlider(JSlider.HORIZONTAL,0,yMaxSize,1);
		xPositionDisplay = new JLabel("000"); 
		yPositionDisplay = new JLabel("000"); 
		// addiing position widgets. 
    positionPanel.add(positionLabel);
		positionPanel.add(xLabel);
    positionPanel.add(xPositionDisplay);
		positionPanel.add(xPosition);
		positionPanel.add(yLabel);
    positionPanel.add(yPositionDisplay);
		positionPanel.add(yPosition);
    add(positionPanel);

    /* Type */ 
    // type panel
    JPanel typePanel = new JPanel(); 
    typePanel.setBackground(Color.MAGENTA);
    typePanel.setLayout(new BoxLayout(typePanel,BoxLayout.Y_AXIS));
    // type widgets. 
    shipTypeLabel = new JLabel ("Ship Type:");
    rbBoat = new JRadioButton ("Boat");
    rbYatch = new JRadioButton("Yatch");
    rbSub = new JRadioButton("Sub");

    // group type radio buttons.
    ButtonGroup group = new ButtonGroup();
    group.add(rbBoat);
    group.add(rbYatch);
    group.add(rbSub);

    //add them to panel
    typePanel.add(shipTypeLabel);
    typePanel.add(rbBoat);
    typePanel.add(rbYatch);
    typePanel.add(rbSub);
    add(typePanel);

    /* Direction */ 
    //direction panel 
    JPanel directionPanel = new JPanel();
    directionPanel.setBackground(Color.MAGENTA);
    directionPanel.setLayout(new BoxLayout(directionPanel,BoxLayout.Y_AXIS));
    //direction widgets
    directionLabel = new JLabel ("direction:");
    rbNorth  = new JRadioButton ("North"); 
    rbSouth = new JRadioButton ("South"); 
    rbEast = new JRadioButton ("East"); 
    rbWest = new JRadioButton ("West"); 
    // group direction radio buttons.
    ButtonGroup direction_group = new ButtonGroup();
    direction_group.add(rbNorth);
    direction_group.add(rbSouth);
    direction_group.add(rbEast);
    direction_group.add(rbWest);
    //add to the panel. 
    directionPanel.add(directionLabel);
    directionPanel.add(rbNorth);
    directionPanel.add(rbSouth);
    directionPanel.add(rbEast);
    directionPanel.add(rbWest);
    add(directionPanel);
 	/* ADD SHIP BUTTON */ 
   JPanel addPanel = new JPanel();
   addPanel.setLayout(new BoxLayout(addPanel,BoxLayout.Y_AXIS));
   addPanel.setBackground(Color.MAGENTA);
 		addShipButton = new JButton("Add");
 		addPanel.add(addShipButton); 
    add(addPanel);

 	}
  public Types.Direction get_selectedDirection(){
      if (rbNorth.isSelected())
        return Types.Direction.NORTH;
      if (rbSouth.isSelected())
        return Types.Direction.SOUTH;
      if (rbEast.isSelected())
        return Types.Direction.EAST;
      if (rbWest.isSelected())
        return Types.Direction.WEST;
      //if none, default is 
      return Types.Direction.NORTH;
  }

  public Types.Ship get_selectedType(){
    if (rbBoat.isSelected())
      return Types.Ship.BOAT;
    if (rbYatch.isSelected())
      return Types.Ship.YATCH;
    if (rbSub.isSelected())
      return Types.Ship.SUB;
    //if none are selected, return BOAT as default. 
    return Types.Ship.BOAT;


  }

 	public void refresh(){
      //updates the sliders maximum value, depending on canvas.
			xMaxSize = (int) map.get_canvasSize().getWidth();
			yMaxSize = (int) map.get_canvasSize().getHeight(); 
      xPosition.setMaximum(xMaxSize);
      yPosition.setMaximum(yMaxSize);
		
 	}


 	/*setter functions*/ 
 	public void set_xPositionDisplay(int tf){
 		xPositionDisplay.setText(String.valueOf(tf));
 	}
	public void set_yPositionDisplay(int tf){
		yPositionDisplay.setText(String.valueOf(tf));

	}



 	/*getter functions */ 
 	public JButton get_addShipButton(){
 		return addShipButton; 
 	}
 	public JPanel get_addPanel(){
 		return addPanel;
 	}  
 	public JSlider get_xPosition(){
 		return xPosition;
 	}
 	public JSlider get_yPosition(){
 		return yPosition;
 	}
 	public JLabel get_xLabel(){
 		return xLabel;
 	}
	public JLabel get_yLabel(){
		return yLabel;
	}
	public JLabel get_xPositionDisplay(){
		return xPositionDisplay;
	}
	public JLabel get_yPositionDisplay(){
		return yPositionDisplay;
	}
  public JRadioButton get_rbBoat(){
    return rbBoat;
  }
  public JRadioButton get_rbYatch(){
    return rbYatch;
  }
  public JRadioButton get_rbSub(){
    return rbSub;
  }
  public JRadioButton get_rbNorth() {
    return rbNorth;
  }
  public JRadioButton get_rbSouth(){
    return rbSouth;
  }
  public JRadioButton  get_rbEast(){
    return rbEast;
  }
  public JRadioButton get_rbWest(){
    return rbWest;
  }
}