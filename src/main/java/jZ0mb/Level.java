package jZ0mb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Level {
    public File f;
    public String[] layer_1_mat = new String[925];
    public String[] layer_2_mat = new String[925];
    public String[] layer_3_mat = new String[925];

    public Level(String filepath) {
        int n = 32;
        for (int i = 0; i < 925; i++) {
            layer_1_mat[i] = "img\\grass.png";
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
                                layer_1_mat[line * n + block] = "img/grass.png";
                            }
                            if (layer == 2) {
                                layer_2_mat[line * n + block] = "img/grass.png";
                            }
                            if (layer == 3) {
                                layer_3_mat[line * n + block] = "img/grass.png";
                            }
                        }
                        if (mat.equalsIgnoreCase("water")) {
                            if (layer == 1) {
                                layer_1_mat[line * n + block] = "img/water.png";
                            }
                            if (layer == 2) {
                                layer_2_mat[line * n + block] = "img/water.png";
                            }
                            if (layer == 3) {
                                layer_3_mat[line * n + block] = "img/water.png";
                            }
                        }
                        if (mat.equalsIgnoreCase("asphalt")) {
                            if (layer == 1) {
                                layer_1_mat[line * n + block] = "img/asphalt.png";
                            }
                            if (layer == 2) {
                                layer_2_mat[line * n + block] = "img/asphalt.png";
                            }
                            if (layer == 3) {
                                layer_3_mat[line * n + block] = "img/asphalt.png";
                            }
                        }
                        if (mat.equalsIgnoreCase("asphalt_broken")) {
                            if (layer == 1) {
                                layer_1_mat[line * n + block] = "img/asphalt_broken.png";
                            }
                            if (layer == 2) {
                                layer_2_mat[line * n + block] = "img/asphalt_broken.png";
                            }
                            if (layer == 3) {
                                layer_3_mat[line * n + block] = "img/asphalt_broken.png";
                            }
                        }
                        if (mat.equalsIgnoreCase("plate")) {
                            if (layer == 1) {
                                layer_1_mat[line * n + block] = "img/plate.png";
                            }
                            if (layer == 2) {
                                layer_2_mat[line * n + block] = "img/plate.png";
                            }
                            if (layer == 3) {
                                layer_3_mat[line * n + block] = "img/plate.png";
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.exit(1);
        }
    }

    public File getFile() {
        return f;
    }
}
