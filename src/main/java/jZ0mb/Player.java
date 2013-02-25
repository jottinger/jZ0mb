package jZ0mb;

public class Player {
    private Level l;
    private int x;
    private int y;
    private int speed;
    private String dir;

    public Player(Level l, int x, int y, int speed, String dir) {
        this.l = l;
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Level getLevel() {
        return l;
    }

    //public LevelObject getLevelObject() { return null;}
//public Image getImage() { return new ImageIcon("img/hobo_"+dir+".png").getImage(); }
    public void move(String d) {
        dir = d;
        if (d.equals("up")) {
            y = y - speed;
        }
    }
}