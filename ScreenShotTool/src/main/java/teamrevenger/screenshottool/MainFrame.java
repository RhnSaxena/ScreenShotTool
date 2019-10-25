/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrevenger.screenshottool;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author thesid01
 * @author rakshak
 * @author rohan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    private boolean loaded = false;
    private String lastOpened = "";
    public ScreenShot screenShot = new ScreenShot();
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        ParentPanel = new javax.swing.JPanel();
        ToolBarPanel = new javax.swing.JPanel();
        captureButton = new javax.swing.JButton();
        Thumbnail = new javax.swing.JPanel();
        ThumbnailcrollPanel = new javax.swing.JScrollPane();
        Share = new javax.swing.JPanel();
        MiddlePanel = new javax.swing.JPanel();
        ImageContainerPanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        MainMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 0, 102));
        setMinimumSize(new java.awt.Dimension(800, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        ParentPanel.setBackground(new java.awt.Color(204, 0, 204));

        captureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ToolBarPanelLayout = new javax.swing.GroupLayout(ToolBarPanel);
        ToolBarPanel.setLayout(ToolBarPanelLayout);
        ToolBarPanelLayout.setHorizontalGroup(
            ToolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ToolBarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(captureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ToolBarPanelLayout.setVerticalGroup(
            ToolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(captureButton)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        try{
            Image img = ImageIO.read(new FileInputStream("resources/scissor.png"));
            captureButton.setIcon(new ImageIcon(img));
            System.out.println("Image fetched");
        }catch(Exception ex){
            System.out.println(ex);
        }

        javax.swing.GroupLayout ThumbnailLayout = new javax.swing.GroupLayout(Thumbnail);
        Thumbnail.setLayout(ThumbnailLayout);
        ThumbnailLayout.setHorizontalGroup(
            ThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThumbnailcrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        ThumbnailLayout.setVerticalGroup(
            ThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThumbnailcrollPanel)
        );

        File folder = new File("./");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                ImageLabel = new javax.swing.JLabel();
                ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ImageLabel.setMaximumSize(new java.awt.Dimension(200, 200));
                ImageLabel.setMinimumSize(new java.awt.Dimension(200, 200));
                ThumbnailcrollPanel.add(ImageLabel);
                System.out.println("Thumbnail Loaded");
            }
            //    else if (listOfFiles[i].isDirectory()) {
                //    System.out.println("Directory " + listOfFiles[i].getName());
                //  }
        }

        javax.swing.GroupLayout ShareLayout = new javax.swing.GroupLayout(Share);
        Share.setLayout(ShareLayout);
        ShareLayout.setHorizontalGroup(
            ShareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ShareLayout.setVerticalGroup(
            ShareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        MiddlePanel.setBackground(new java.awt.Color(255, 102, 51));

        ImageContainerPanel.setBackground(new java.awt.Color(51, 51, 255));

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setMaximumSize(new java.awt.Dimension(400, 400));
        ImageLabel.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout ImageContainerPanelLayout = new javax.swing.GroupLayout(ImageContainerPanel);
        ImageContainerPanel.setLayout(ImageContainerPanelLayout);
        ImageContainerPanelLayout.setHorizontalGroup(
            ImageContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageContainerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        ImageContainerPanelLayout.setVerticalGroup(
            ImageContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageContainerPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout MiddlePanelLayout = new javax.swing.GroupLayout(MiddlePanel);
        MiddlePanel.setLayout(MiddlePanelLayout);
        MiddlePanelLayout.setHorizontalGroup(
            MiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MiddlePanelLayout.setVerticalGroup(
            MiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ParentPanelLayout = new javax.swing.GroupLayout(ParentPanel);
        ParentPanel.setLayout(ParentPanelLayout);
        ParentPanelLayout.setHorizontalGroup(
            ParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentPanelLayout.createSequentialGroup()
                .addComponent(ToolBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Share, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ParentPanelLayout.setVerticalGroup(
            ParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentPanelLayout.createSequentialGroup()
                .addGroup(ParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ToolBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thumbnail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Share, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FileMenu.setText("File");
        FileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenuActionPerformed(evt);
            }
        });

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.setBorderPainted(true);
        Open.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        FileMenu.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        FileMenu.add(Save);

        Exit.setText("Exit");
        FileMenu.add(Exit);

        MainMenuBar.add(FileMenu);

        EditMenu.setText("Edit");
        MainMenuBar.add(EditMenu);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void captureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureButtonActionPerformed
        // TODO add your handling code here:
        setExtendedState(JFrame.ICONIFIED);
        screenShot.takeScreenShot();
        this.loaded = true;
        try {
            Image img;
            img = this.screenShot.getScreenShot(this.screenShot.getLastName());
            this.drawScreenShot(img);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_captureButtonActionPerformed

        
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        String str = this.screenShot.getLastName();
        System.out.println("siddharth");
        if(this.loaded == true)
            this.resizeScreenShot(str);
    }//GEN-LAST:event_formComponentResized

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            var file = fileChooser.getSelectedFile();
            Image img;
            try {
                screenShot.setLastScreenShotName(file.getAbsolutePath());
                img = screenShot.getScreenShot(file.getAbsolutePath());
                this.drawScreenShot(img);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("File Opened" + file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void FileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileMenuActionPerformed

    
    public void drawScreenShot(Image img){
        try{
//            String size = img.getWidth(null) + "x" + img.getHeight(null);
            float ratio =  (float)img.getWidth(null)/(float)img.getHeight(null);
            Image newImage = img.getScaledInstance((int) ((this.getWidth()-400)), (int) ((this.getWidth()-400)/ratio), Image.SCALE_DEFAULT);

            ImageLabel.setIcon(new ImageIcon(newImage));
//            ImageLabel.setText(size);
            System.out.println("Image fetched");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    void resizeScreenShot(String name){
        try{
            Image img = this.screenShot.getScreenShot(name);
//            String size = img.getWidth(null) + "x" + img.getHeight(null);
            float ratio =  (float)img.getWidth(null)/(float)img.getHeight(null);
            Image newImage = img.getScaledInstance(this.getWidth() - 400 , (int) ((this.getWidth() - 400)/ratio), Image.SCALE_DEFAULT);
            this.ImageLabel.setIcon(new ImageIcon(newImage));
//            this.ImageLabel.setText(size);
            System.out.println("Image Resized");
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // create main frame
                MainFrame frame = new MainFrame();
                //center Main Frame
                frame.setTitle("Screen Shot Tool"); //set title
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen                
                frame.setVisible(true); // set visible;
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JPanel ImageContainerPanel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JMenuItem Open;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JMenuItem Save;
    private javax.swing.JPanel Share;
    private javax.swing.JPanel Thumbnail;
    private javax.swing.JScrollPane ThumbnailcrollPanel;
    private javax.swing.JPanel ToolBarPanel;
    private javax.swing.JButton captureButton;
    private javax.swing.JFileChooser fileChooser;
    // End of variables declaration//GEN-END:variables
}
