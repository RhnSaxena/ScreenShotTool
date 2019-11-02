/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;



/**
 *
 * @author Rakshak
 */

// package com.javacodegeeks.snippets.desktop;

class AfterCrop extends Component {
    static String FileName;  
    int sX = -1, sY = -1;
    static Label stat;
    Image bImage;
    boolean dragging = false;
    int curX = -1, curY = -1;
    public static JFrame jFrame;
    public static void cropFunction(String args) {
        
      FileName = args;
      jFrame = new JFrame("Mouse Cropped");
     
      Container cPane = jFrame.getContentPane();
     
      Image im = Toolkit.getDefaultToolkit().getImage(args);
     
      Sketch sk = new Sketch(im);
     
      cPane.setLayout(new BorderLayout());
     
      cPane.add(BorderLayout.NORTH, new Label(""));
     
      cPane.add(BorderLayout.CENTER, sk);
     
      cPane.add(BorderLayout.SOUTH, stat = new Label());
     
      stat.setSize(jFrame.getSize().width, stat.getSize().height);
     
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      jFrame.pack();
     
      jFrame.setVisible(true);
 
    }

    public AfterCrop(Image i) {
      super();
      bImage = i;
      setSize(300, 200);
      //addMouseListener(this);
      //addMouseMotionListener(this);
    }
 
    public void showStatus(String s) {
      stat.setText(s);
    }
 
}
