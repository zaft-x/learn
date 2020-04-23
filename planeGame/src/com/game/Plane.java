package com.game;

import java.awt.*;

public class Plane extends GameObject {

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        g.drawImage(img, (int) x, (int) y, null);
        x++;
    }

    public Plane(Image img, double x, double y) {
        super(img, x, y);
    }
}
