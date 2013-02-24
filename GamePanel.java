import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GamePanel extends JPanel implements ActionListener {
Timer t = new Timer(5,this);
public GamePanel() {
setVisible(true);
t.start();
}
public void paint(Graphics g) {
g.fillRect(0,0,1200,600);
}
public void actionPerformed(ActionEvent evt) {
repaint();
}
}