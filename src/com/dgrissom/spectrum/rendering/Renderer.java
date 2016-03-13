package com.dgrissom.spectrum.rendering;

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


}
