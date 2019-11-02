/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

/**
 *
 * @author Rakshak
 */

// package com.javacodegeeks.snippets.desktop;
 
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Label;
//import java.awt.Point;
//import java.awt.Toolkit;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//import java.awt.event.WindowEvent;
//import javax.imageio.ImageIO;
//import java.io.FileInputStream;
//import java.io.File; 
//import javax.swing.JFrame;
//import java.awt.image.BufferedImage;

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
import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.File; 
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import javax.swing.ImageIcon;

class Sketch extends Component implements MouseListener, MouseMotionListener {
    static String FileName;  
    int sX = -1, sY = -1;
    static Label stat;
    Image bImage;
    boolean dragging = false;
    int curX = -1, curY = -1;
    public static JFrame jFrame;
    public static String CropName;
    public static void cropFunction(String args) {
        
      FileName = args;
      jFrame = new JFrame("Mouse Dragger");
     
      Container cPane = jFrame.getContentPane();
     
      Image im = Toolkit.getDefaultToolkit().getImage(args);
     
      Sketch sk = new Sketch(im);
     
      cPane.setLayout(new BorderLayout());
     
      cPane.add(BorderLayout.NORTH, new Label(""));
     
      cPane.add(BorderLayout.CENTER, sk);
     
      cPane.add(BorderLayout.SOUTH, stat = new Label());
     
      stat.setSize(jFrame.getSize().width, stat.getSize().height);
     
//      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      jFrame.pack();
     
      jFrame.setVisible(true);
 
    }

    public Sketch(Image i) {
      super();
      bImage = i;
      setSize(300, 200);
      addMouseListener(this);
      addMouseMotionListener(this);
    }
 
    public void showStatus(String s) {
      stat.setText(s);
    }
 
    @Override
    public void mouseClicked(MouseEvent event) {
    }
 
    @Override
    public void mouseEntered(MouseEvent event) {
    }
 
    @Override
    public void mouseExited(MouseEvent event) {
    }
 
    @Override
    public void mousePressed(MouseEvent event) {
      Point point = event.getPoint();
      System.out.println("mousePressed at " + point);
     
      sX = point.x;
      sY = point.y;
     
      dragging = true;
    }
 
    @Override
    public void mouseReleased(MouseEvent event) {
      dragging = false;
     
      System.out.println("Drawn rectangle area IS " + sX + "," + sY + " to "
        + curX + "," + curY);
      

      
    }
     
    @Override
    public void mouseDragged(MouseEvent event) {
      Point p = event.getPoint();
     
      // System.err.println("mouse drag to " + p);
     
      showStatus("mouse Dragged to " + p);
     
      curX = p.x;
     
      curY = p.y;
     
      if (dragging) {
        repaint();
      }
    }
 
    @Override
    public void paint(Graphics graphic) {
 
      int w = curX - sX, h = curY - sY;
     
      Dimension dims = getSize();
     
      graphic.drawImage(bImage, 0, 0, dims.width, dims.height, this);
      
      try{
        BufferedImage subimage1=ImageIO.read(new File(FileName));
          try{
              
            //BufferedImage subimage=subimage1.getSubimage(0,0,dims.width, dims.height);
            ImageIcon icon = new ImageIcon(FileName);
            Image image = icon.getImage();
            //image = createImage(new FilteredImageSource(image.getSource(),new CropImageFilter(0,0,dims.width, dims.height)));
            BufferedImage subimage=subimage1.getSubimage(sX,sY,w, h);
              System.out.println(dims.width);
            CropName="cropped"+FileName;
            ImageIO.write(subimage,"png",new File(CropName));
            
            
          }catch(Exception e){
              System.out.println(e);
          }
        }catch(Exception e){
            System.out.println(e+"       1");
      }
      
      


      
     
      if (sX < 0 || sY < 0) {
        return;
      }
 
      System.out.println("Rect[" + sX + "," + sY
     
        + "] size " + w + "x" + h);
     Color c=new Color(1f,0f,0f,.5f );
      graphic.setColor(c);
     
      graphic.fillRect(sX, sY, w, h);
    }
 
    @Override
    public void mouseMoved(MouseEvent e) {
      showStatus("Mouse to " + e.getPoint());
    }

}
