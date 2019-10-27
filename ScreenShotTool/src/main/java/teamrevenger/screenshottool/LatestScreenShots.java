/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author thesid01
 */
public class LatestScreenShots {
    private ArrayList<String> str;

    public LatestScreenShots() {
        this.str = new ArrayList<String>();
    }
    
    
    public ArrayList<String> getLatestScreenShotName(){
        File folder = new File("./");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".png")) {
                String s = file.getName();
                str.add(s);
            }
        }
        return str;
    }
}
