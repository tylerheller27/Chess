package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable // JPanel class we want to customize it.
                                      // where going to use this as the game screen
{

  public static final int WIDTH = 1100;
  public static final int HEIGHT = 800;
  final int FPS = 60;
  Thread gameThread;

    public GamePanel() // on arg constructor. when an obj is created in main it will be created with
        {
          setPreferredSize(new Dimension(WIDTH,HEIGHT));
         setBackground(Color.black);
        }

        public void launchGame()
        {
          gameThread = new Thread(this);
          gameThread.start();
        }
        @Override
        public void run()
        {
          //gmae loop
          double drawInterval = 1000000000/FPS;
          double delta = 0;
          long lastTime = System.nanoTime();
          long currentTime;

          currentTime =  System.nanoTime();

          delta += (currentTime - lastTime)/drawInterval;
          lastTime = currentTime;

                  if(delta >=1)
                  {
                    update();
                    repaint();
                    delta--;
                  }//if
        }//void override

        //methods
        // the purpose of these to methods is to create a game loop that keeps calling these to methods 60 times per
        // second to continously update the screen
        public void update()
        {

        }
        /*
        paintComponent is a method in JComponent that JPanel inherits and is used to draw objects on tlhe panel.
        */
        public void paintComponent(Graphics g)
        {
          super.paintComponent(g);
        }




}//class
