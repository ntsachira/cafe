
package com.cafe.Handlers;

import com.cafe.gui.Dashboard;
import java.awt.Component;
import java.awt.Frame;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImageHandler {
   public static File selectImage(Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("*.image", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();            
        }
       return null;
    }
   
   public static ImageIcon getEmptyImage(Component parent){
       return new ImageIcon(parent.getClass().getResource("/com/cafe/itemImg/emptyItem.png"));
   }
   
   public static File getPicturesDirectory(){
       File picturesDir = new File(System.getProperty("user.dir")+File.separator+"Pictures");
       if(!picturesDir.exists()){
           picturesDir.mkdir();
       }
       return picturesDir;
   }
}
