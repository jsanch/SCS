////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: AnimationPanel.java
// Description: *****
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class AnimationPanel extends JPanel {
	private Model map;

  private JSlider speedSlider;
	private JButton startButton;
  private JButton stopButton;

	public AnimationPanel(Model m){
		map = m ; 
        setLayout(new GridLayout(3,1));

    // type of animation. 
    //move ships. (moves all ships to their direction). (has one parameter: speed. )
    JLabel moveLabel = new JLabel("This Animation moves all ships in their respective direction.");
    add(moveLabel);

    //Speed Slider. 
    JPanel speedPanel = new JPanel ();
    //creating position widgets
    JLabel speedTitle = new JLabel("Speed(pixels/second)");
    JLabel speedDisplay = new JLabel( "0");
           speedSlider = new JSlider(JSlider.HORIZONTAL,0,10,1);
    //adding speed widgets
    speedPanel.add(speedTitle);
    speedPanel.add(speedDisplay);
    speedPanel.add(speedSlider);
    add(speedPanel);




    // start stop buttons.
    JPanel startstop = new JPanel();
    startButton = new JButton("Start");
    startstop.add(startButton);
    stopButton = new JButton("Stop");
    startstop.add(stopButton);
    add(startstop);


	}
}