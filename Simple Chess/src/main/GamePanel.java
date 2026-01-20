package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel // JPanel class we want to customize it.
                                      // where going to use this as the game screen
{

  public static final int WIDTH = 1100;
  public static final int HEIGHT = 800;

    public GamePanel()
        {
      setPreferredSize(new Dimension(WIDTH,HEIGHT));
      setBackground(Color.black);
        }



}//class
