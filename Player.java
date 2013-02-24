public class Player {
private Level l;
private int x , y , speed;
private String dir;
public void Player(Level l,int x,int y,int speed,String dir) {
this.l = l;
int.x = x;
int.y = y;
this.dir = dir;
}
public int getX() {return x;}
public int getY() {return y;}
public int getLevel() {return lvl;}
//public LevelObject getLevelObject() { return null;}
public Image getImage() { return new ImageIcon("img/hobo_"+dir").getImage(); }
public void move(String d) {
dir = d;
if (d == "up") {
y - speed;
}
}
}