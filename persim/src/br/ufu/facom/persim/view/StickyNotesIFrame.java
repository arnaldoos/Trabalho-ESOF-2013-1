package br.ufu.facom.persim.view;

import br.ufu.facom.persim.config.Path;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class StickyNotesIFrame extends JInternalFrame {
    
  private volatile int screenX = 0;
  private volatile int screenY = 0;
  private volatile int myX = 0;
  private volatile int myY = 0;

  public StickyNotesIFrame() {
      
    this.setVisible(true);
    this.setSize(150, 170);
    this.setOpaque(false);
    ImageIcon iconeX = new ImageIcon(Path.getImagePath("x.png"));
    Image img = iconeX.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
    iconeX = new ImageIcon(img);
    JLabel lb = new JLabel(iconeX);
    
    lb.setBounds(0, 200, 15, 15);
    this.getContentPane().setLayout(null);
    this.getContentPane().add(lb);
    lb.setLocation(120, 3);
    this.setBackground(new Color(0,0,0,0));
    this.getContentPane().setBackground(new Color(255,255,153));
    
    lb.addMouseListener(new MouseListener() {

          @Override
          public void mouseClicked(MouseEvent e) {}

          @Override
          public void mousePressed(MouseEvent e) {
              /*((JInternalFrame)
                      ((JRootPane)(((JLayeredPane)((JPanel)
                      ((JLabel) e.getSource())
                      .getParent()).getParent()).getParent())).getParent()).dispose();*/
              closeThisFrame();
          }

          @Override
          public void mouseReleased(MouseEvent e) {}

          @Override
          public void mouseEntered(MouseEvent e) {}

          @Override
          public void mouseExited(MouseEvent e) {}
      });
    
    ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    this.addMouseListener(new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) { }

      @Override
      public void mousePressed(MouseEvent e) {
        screenX = e.getXOnScreen();
        screenY = e.getYOnScreen();

        myX = getX();
        myY = getY();
      }

      @Override
      public void mouseReleased(MouseEvent e) { }

      @Override
      public void mouseEntered(MouseEvent e) { }

      @Override
      public void mouseExited(MouseEvent e) { }

    });
    this.addMouseMotionListener(new MouseMotionListener() {

      @Override
      public void mouseDragged(MouseEvent e) {
        int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;

        setLocation(myX + deltaX, myY + deltaY);
      }

      @Override
      public void mouseMoved(MouseEvent e) { }

    });
    
   }
  
  private void closeThisFrame(){
      this.dispose();
  }
  
}
