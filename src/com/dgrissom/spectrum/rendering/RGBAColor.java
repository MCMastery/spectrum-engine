package com.dgrissom.spectrum.rendering;

import com.dgrissom.spectrum.utils.MathUtils;

import java.awt.*;

/**
 * Created by mynam_000 on 3/12/2016.
 */
public class RGBAColor {
    private final double r, g, b, a;

    public RGBAColor(double rgb) {
        this(rgb, rgb, rgb);
    }
    public RGBAColor(double r, double g, double b) {
        this(r, g, b, 1);
    }
    public RGBAColor(double r, double g, double b, double a) {
        this.r = MathUtils.clamp(r, 1);
        this.g = MathUtils.clamp(g, 1);
        this.b = MathUtils.clamp(b, 1);
        this.a = MathUtils.clamp(a, 1);
    }

    public double getRed() {
        return this.r;
    }
    public RGBAColor setRed(double r) {
        return new RGBAColor(r, this.g, this.b, this.a);
    }
    public double getGreen() {
        return this.g;
    }
    public RGBAColor setGreen(double g) {
        return new RGBAColor(this.r, g, this.b, this.a);
    }
    public double getBlue() {
        return this.b;
    }
    public RGBAColor setBlue(double b) {
        return new RGBAColor(this.r, this.g, b, this.a);
    }
    public double getAlpha() {
        return this.a;
    }
    public RGBAColor setAlpha(double a) {
        return new RGBAColor(this.r, this.g, this.b, a);
    }

    public Color toJavaColor() {
        return new Color(MathUtils.round(this.r * 255), MathUtils.round(this.g * 255), MathUtils.round(this.b * 255), MathUtils.round(this.a * 255));
    }
    public static RGBAColor fromJavaColor(Color color) {
        return new RGBAColor(color.getRed() / 255.0, color.getGreen() / 255.0, color.getBlue() / 255.0, color.getAlpha() / 255.0);
    }

    public boolean equalsIgnoreAlpha(RGBAColor other) {
        return other.getRed() == this.r && other.getGreen() == this.g && other.getBlue() == this.b;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RGBAColor))
            return false;
        RGBAColor other = (RGBAColor) o;
        return other.getRed() == this.r && other.getGreen() == this.g && other.getBlue() == this.b && other.getAlpha() == this.a;
    }
}
