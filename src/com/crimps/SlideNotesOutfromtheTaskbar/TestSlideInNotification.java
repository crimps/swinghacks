package com.crimps.SlideNotesOutfromtheTaskbar;

import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author crimps
 * @create 2017-12-28 16:16
 **/
public class TestSlideInNotification {
    public static void main (String[] args) {
        Icon errorIcon = UIManager.getIcon ("OptionPane.errorIcon");
        JLabel label = new JLabel ("Your application asplode",
                errorIcon,
                SwingConstants.LEFT);
        SlideInNotification slider = new SlideInNotification (label);
        slider.showAt (650);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
