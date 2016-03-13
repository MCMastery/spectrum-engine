package com.dgrissom.spectrum.rendering;

import javax.swing.*;

/**
 * Created by mynam_000 on 3/13/2016.
 */
public class Display {
    private JFrame frame;

    public Display(String title) {
        this.frame = new JFrame(title);
        this.frame.setUndecorated(true);
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public JFrame getJFrame() {
        return this.frame;
    }
}
