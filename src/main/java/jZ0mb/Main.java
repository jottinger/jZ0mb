/*
jZ0mb (c) spycrab0 2013 
Some right reserved.see license.txt
Main Class of the Launcher 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main implements ActionListener {
private static JFrame frm = new JFrame();
private static JLabel username = new JLabel("User:");
private static JLabel password = new JLabel("Pass:");
private static JTextField username_field = new JTextField();
private static JPasswordField password_field = new JPasswordField();
private static ButtonGroup bg = new ButtonGroup();
private static JCheckBox sp = new JCheckBox ("Singleplayer");
private static JCheckBox mp = new JCheckBox("Multiplayer");
private static JButton play = new JButton("Play");
private static JPanel p = new JPanel();
public static void main(String[] args) {
new Main().initFrame();
}
public void initFrame() {
System.out.println("jZ0mb Alpha v1 Launcher");
frm.setSize(250,150);
frm.setResizable(false);
frm.setTitle("jZ0mb Launcher");
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.add(p);
p.add(username);
p.add(username_field);
username_field.setPreferredSize(new Dimension(200,25));
p.add(password);
password.setForeground(Color.GRAY);
p.add(password_field);
password_field.setEnabled(false);
password_field.setPreferredSize(new Dimension(200,25));
bg.add(sp);
bg.add(mp);
p.add(sp);
sp.setSelected(true);
p.add(mp);
mp.setEnabled(false);
p.add(play,BorderLayout.SOUTH);
play.addActionListener(this);
play.setActionCommand("play");
frm.setVisible(true);
}
public void actionPerformed(ActionEvent evt) {
if (evt.getActionCommand().equals("play")) {
System.out.println("Initalising GameFrame...");
JFrame frame = new JFrame();
frame.add(new GamePanel());
frame.setSize(1190,605);
frame.setTitle("jZ0mb - Alpha v1");
frame.setVisible(true);
frame.setResizable(false);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setVisible(false);
}
}
}