package Utils;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karmit_patel
 */
public class ScreenUtil {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Get Screen Dimensions
     * @return 
     */
    public Dimension getScreenSize() {
        return this.screenSize.getSize();
    }
    
    /**
     * Get the Screen Width
     * @return 
     */
    public int getScreenWidth(){
        return this.getScreenSize().width;
    }
    
    /**
     * Get the Screen Height
     * @return 
     */
    public int getScreenHeight() {
        return this.getScreenSize().height;        
    }
    
    /**
     * Convert provided Image Icon to the Screen Size.
     * @param icon
     * @return 
     */
    public ImageIcon convertImageToScreenSize(ImageIcon icon){
        Image image = icon.getImage().getScaledInstance(this.getScreenWidth(), this.getScreenHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
    
    public ScreenUtil(){
        
    }

}
