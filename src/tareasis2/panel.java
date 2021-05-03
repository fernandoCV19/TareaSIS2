package tareasis2;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JorgeLPR
 */
public class panel extends JPanel{
    
    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();        
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/celestexd.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }   
    
    /*
    @Override
    public void paint(Graphics g){
        
        Dimension dimension = this.getSize();        
        URL url = this.getClass().getResource("/images/tenor.gif");
        Image image = new ImageIcon(url).getImage();
        g.drawImage(image, 0, 0, dimension.width, dimension.height, this);
        setOpaque(false);
        super.paintChildren(g);
    
    }*/    
    
}
