/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author thesid01
 */
public class ThumbnailLabel extends JLabel {
    private String fileName;
    private Image img;
    
    ThumbnailLabel(String name) throws FileNotFoundException, IOException{
        super();
        this.fileName = name;
        this.img = ImageIO.read(new FileInputStream(this.fileName));
        float ratio = this.img.getWidth(null)/img.getHeight(null);
        this.img  = this.img.getScaledInstance(150, (int) (150/ratio), Image.SCALE_DEFAULT); 
    }
    
    public ImageIcon getImageIcon(){
        ImageIcon ic = new ImageIcon(img);
        return ic;
    }
}
