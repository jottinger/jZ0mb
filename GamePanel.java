import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GamePanel extends JPanel implements ActionListener {
Level l = new Level("map/001.jz");
Timer t = new Timer(5,this);
Player p = new Player(l,500,300,10,"up");
public GamePanel() {
setVisible(true);
t.start();
}
public void paint(Graphics g) {
g.fillRect(0,0,1200,600);
int lines = 25;
int blocks = 37;
for (int i = 0;i < lines;i++) {
for (int i2 = 0;i2 < blocks;i2++) {
if (l.layer_1_mat[i * 32 + i2] != null) {
g.drawImage(new ImageIcon(l.layer_1_mat[i * 32 + i2]).getImage(),i2 * 32 ,i * 32,null);
}
}
}
for (int i = 0;i < lines;i++) {
for (int i2 = 0;i2 < blocks;i2++) {
if (l.layer_1_mat[i * 32 + i2] != null) {
g.drawImage(new ImageIcon(l.layer_2_mat[i * 32 + i2]).getImage(),i2 * 32 ,i * 32,null);
}
}
}
//g.drawImage(p.getImage(),p.getX(),p.getY(),null);
for (int i = 0;i < lines;i++) {
for (int i2 = 0;i2 < blocks;i2++) {
if (l.layer_1_mat[i * 32 + i2] != null) {
g.drawImage(new ImageIcon(l.layer_3_mat[i * 32 + i2]).getImage(),i2 * 32 ,i * 32,null);
}
}
}
}
public void actionPerformed(ActionEvent evt) {
repaint();
}
}