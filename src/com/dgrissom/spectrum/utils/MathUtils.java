package com.dgrissom.spectrum.utils;

/**
 * A collection of useful math functions
 */
public class MathUtils {
    private MathUtils() {}

    /**
     * Returns x if x &gt;= min and x &lt;= max.
     * Otherwise, returns min if x &lt; min, and max if x &gt; max.
     * @param x the value to clamp
     * @param min the minimum
     * @param max the maxmimum
     * @return returns x if x >= min and x <= max. Otherwise, returns min if x < min, and max if x > max.
     */
    public static double clamp(double x, double min, double max) {
        return x < min ? min : (x > max ? max : x);
    }
    /**
     * Returns x if x &gt;= 0 and x &lt;= max.
     * Otherwise, returns 0 if x &lt; 0, and max if x &gt; max.
     * @param x the value to clamp
     * @param max the maxmimum
     * @return returns x if x >= min and x <= max. Otherwise, returns min if x < min, and max if x > max.
     */
    public static double clamp(double x, double max) {
        return x < 0 ? 0 : (x > max ? max : x);
    }
}
