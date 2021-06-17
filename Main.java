package com.playwithball;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {

        GamePlay gamePlay = new GamePlay();
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(0,0,700,600);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        jFrame.setResizable(false);
        jFrame.setTitle("Brick Breaker");
        jFrame.add(gamePlay);


    }
}
