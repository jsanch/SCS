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
  private JLabel speedDisplay; 

	public AnimationPanel(Model m){
		map = m ; 
    setBackground(Color.RED);
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

    //Speed Slider. 
    JPanel speedPanel = new JPanel ();
    speedPanel.setBackground(Color.RED);
    speedPanel.setLayout(new BoxLayout(speedPanel,BoxLayout.Y_AXIS));
    JLabel speedTitle = new JLabel("Speed(pixels/second)");
           speedDisplay = new JLabel( "0");
           speedSlider = new JSlider(JSlider.HORIZONTAL,0,10,0);
    //adding speed widgets
    JLabel moveLabel = new JLabel("Move ships:");
    speedPanel.add(moveLabel);
    speedPanel.add(speedTitle);
    speedPanel.add(speedDisplay);
    speedPanel.add(speedSlider);
    add(speedPanel);


    // start stop buttons.
    JPanel startstop = new JPanel();
    startstop.setLayout(new BoxLayout(startstop,BoxLayout.Y_AXIS));
    startButton = new JButton("Start");
    startstop.setBackground(Color.RED);
    startstop.add(startButton);
    stopButton = new JButton("Stop");
    startstop.add(stopButton);
    add(startstop);

	}
    /*setter functions */
    public void set_speedDisplay(int n){
        speedDisplay.setText(String.valueOf(n));
    }
    /* getter functions */ 
    public JButton get_startButton(){
      return startButton;
    }
    public JButton get_stopButton(){
      return stopButton;
    }

    public JSlider get_speedSlider(){
        return speedSlider;
    }
    public int get_speed(){
        int speed = (int) speedSlider.getValue();
        return speed;
    }
}