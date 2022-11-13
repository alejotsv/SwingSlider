package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Slider extends JFrame {
    Dimension dim = new Dimension(300, 300);

    Slider(String title, int min, int max, int current){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
