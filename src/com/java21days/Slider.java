package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Slider extends JFrame {
    Dimension dim = new Dimension(300, 300);

    Slider(String title, int min, int max, int current){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);
        JSlider slider = new JSlider(SwingConstants.HORIZONTAL, min, max, current);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        panel.add(slider);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }
}
