/*
jZ0mb (c) spycrab0 2013 
Some right reserved.see license.txt
Main Class of the Launcher 
*/
import javax.swing.*;
import java.awt.*;
public class Main {
private static JLabel username = new JLabel("User:");
private static JLabel password = new JLabel("Pass:");
private static JTextField username_field = new JTextField();
private static JPasswordField password_field = new JPasswordField();
private static ButtonGroup bg = new ButtonGroup();
private static JCheckBox sp = new JCheckBox("Singleplayer");
private static JCheckBox mp = new JCheckBox("Multiplayer");
private static JButton play = new JButton("Play");
private static JPanel p = new JPanel();
public static void main(String[] args) {
System.out.println("jZ0mb Alpha v1 Launcher");
JFrame frm = new JFrame();
frm.setSize(250,125);
frm.setResizable(false);
frm.setTitle("jZ0mb Alpha Launcher");
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.add(p);
p.add(username);
p.add(username_field);
username_field.setPreferredSize(new Dimension(200,25));
p.add(password);
p.add(password_field);
password_field.setEnabled(false);
password_field.setPreferredSize(new Dimension(200,25));
bg.add(sp);
bg.add(mp);
p.add(sp);
p.add(mp);
p.add(play,BorderLayout.SOUTH);
frm.setVisible(true);
}
}
