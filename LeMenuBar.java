///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeMenuBar.java
// Description: This is the CLass for the Menu Bar. It has 
//				a private instance variable for security.
//								
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;


public class LeMenuBar extends JFrame implements ActionListener {
	
	private JMenuBar menuBar;

	public JMenuBar getmenuBar() {
		return menuBar;
	}

	public LeMenuBar(){

		menuBar = new JMenuBar ();

		// Adding menu1 
		JMenu menu1 = new JMenu ("File");
		JMenuItem item = new JMenuItem ("Open");
		menu1.add (item);
		item.addActionListener (this);
		
		item = new JMenuItem ("Save");
		menu1.add (item);
		item.addActionListener (this);

		item = new JMenuItem ("Quit");
		menu1.add (item);
		item.addActionListener (this);

		menuBar.add (menu1);

		// Adding menu2 
		JMenu menu2 = new JMenu ("Control");

		item = new JMenuItem ("New Ship");
		menu2.add (item);
		item.addActionListener (this);
		
		item = new JMenuItem ("Clear Map");
		menu2.add (item);
		item.addActionListener (this);

		item = new JMenuItem ("Restart");
		menu2.add (item);
		item.addActionListener (this);

		menuBar.add (menu2);
	
	}
    // ActionListener method for all the pull-down menu items
    public void actionPerformed (ActionEvent e) {
		if (e.getActionCommand().equals ("Quit")) System.exit (0);
    	else  System.out.println ("Menu item: " + e.getActionCommand());
    }
}