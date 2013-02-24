import java.io.*;
public class Level {
public File f;
public String[] layer_1_mat = new String[925];
public Level(String filepath) {
for (int i = 0;i < 925;i++) {
layer_1_mat[i] = "img/grass.png";
}
f = new File(filepath);
if (f.exists() && f.canRead()) {
try {
BufferedReader br = new BufferedReader(new FileReader(f));
String s;
while ((s = br.readLine()) != null) {
if (!s.startsWith("#")) {
int layer = Integer.valueOf(s.split(";")[0].split(",")[0]);
int line = Integer.valueOf(s.split(";")[0].split(",")[1]);
int block = Integer.valueOf(s.split(";")[0].split(",")[2]);
String mat = s.split(";")[1];
if (mat.equalsIgnoreCase("grass")) {
   if (layer == 1) {
   layer_1_mat[layer * 25 + block] = "img/grass.png";
   }
}
}
}
} catch(Exception ex) {
ex.printStackTrace();
}
} else { System.exit(1); }
}
public File getFile() {
return f;
}
}