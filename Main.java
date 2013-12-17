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
    // Map ( Holds Application Data )
    Model map = new Model();

  /* VIEW */
    View view = new View(map);
  /* CONTROLLER */
    Controller controller = new Controller(map,view);


  }
}

// The Controller manipulates the MODEL(map). 
// The MODEL (map) updates the view. 
  // The View must be redrawn after every manipulation to it. 

// view -> model

// controller -> model.

// view redraws from model.

// contoller changes model.

// loop.
