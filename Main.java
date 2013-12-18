////////////////////////////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Main.java
// Description: Application's main mehtod. Design uses MVC pattern.
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

public class Main {
  public static void main (String[] args) {
    new Main ();
  }
  public Main() {
  /* MODEL */
    Model map = new Model(); //holds app data
  /* VIEW */
    View view = new View(map); //holds the GUI. 
  /* CONTROLLER */
    Controller controller = new Controller(map,view); //Listener
  }
}


