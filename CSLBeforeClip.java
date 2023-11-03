package Mini;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CSLBeforeClip {

    CSLBeforeClip(int x1,int y1,int x2, int y2,  int Wxmin,int Wymin, int Wxmax,int Wymax){
        JFrame newFrame = new JFrame("Clipping Tutorial -> Line -> Cohen Sutherland Line Clipping Algorithm -> Output -> Before Clipping");
        newFrame.setSize(1200, 800);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);
        
        JButton CSLAfterClipButton = new JButton("After Clipping");
        CSLAfterClipButton.setBounds(400, 500, 150, 30); // Set the button's position and size
        newFrame.add(CSLAfterClipButton);

        CSLAfterClipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
               CSLAfterClipFrame cslAfterClipFrame = new CSLAfterClipFrame(x1,y1,x2,y2,Wxmin,Wymin,Wxmax,Wymax);
               newFrame.dispose();
            }
        });

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    clear(g, Color.WHITE);
    
                    g.setColor(Color.BLACK);
                    g.drawRect(Wxmin, Wymin, Wxmax - Wxmin, Wymax - Wymin);
                    g.drawLine(x1, y1, x2, y2);
    
                
                }
    
                public void clear(Graphics g, Color color) {
                    g.setColor(color);
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            };
            newFrame.add(panel);
    }
}
