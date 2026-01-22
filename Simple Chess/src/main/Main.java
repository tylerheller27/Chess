package main;

import javax.swing.*; //

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Chess");// simple chess will be displayed on the top of windows address bar
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);// you cannot resize window of program

        //add gamepanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp); //?
        window.pack(); //window adjusted it size to the game panel

        window.setLocationRelativeTo(null); // starts program in the center of your screen
        window.setVisible(true); // makes so that the window will actually appear
        //test
		
		//test git comment

    }//main

}//class
