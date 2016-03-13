package com.dgrissom.spectrum.rendering;

import com.dgrissom.spectrum.utils.MathUtils;

import java.awt.*;

/**
 * Created by mynam_000 on 3/12/2016.
 */
public class Renderer {
    private final Graphics2D g2d;

    public Renderer(Graphics2D g2d) {
        this.g2d = g2d;
    }

    public Graphics2D getG2D() {
        return this.g2d;
    }
    public void setColor(RGBAColor color) {
        g2d.setColor(color.toJavaColor());
    }

    public void drawRect(double x, double y, double w, double h, RGBAColor color) {
        setColor(color);
        g2d.drawRect(MathUtils.round(x), MathUtils.round(y), MathUtils.round(w), MathUtils.round(h));
    }
}
