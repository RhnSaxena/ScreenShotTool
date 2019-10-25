/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;

/**
 *
 * @author thesid01
 */
public class ScreenShot {
    private String lastScreenShotName;
    
    public String getName(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
        String str = dateFormat.format(date);
        str = str.replaceAll("\\D+","");
        return str;
    }
    
    public String getLastName(){
        return this.lastScreenShotName;
    }
    
    public void setLastScreenShotName(String str){
        this.lastScreenShotName = str;
    }
    
    void takeScreenShot(){
        try {
            Robot robot = new Robot();
            String format = "png";
            String fileName = this.getName()+"."+format;
            this.lastScreenShotName = fileName;
            Rectangle screenRect = new  Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
        } catch (AWTException | IOException ex) {
            System.err.println("catch block \n"+ ex);
        }
    }
    
    public Image getScreenShot(String name) throws FileNotFoundException, IOException{
    Image img = ImageIO.read(new FileInputStream(name));
        return img;
    }
}
