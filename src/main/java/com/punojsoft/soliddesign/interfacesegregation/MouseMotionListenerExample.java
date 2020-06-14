package com.punojsoft.soliddesign.interfacesegregation;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * The best place to look for IPS examples is Java AWT event handlers for handling GUI events fired from keyboard and mouse.
 * It has different listener classes for each kind of event.
 * We only need to write handlers for events, we wish to handle. Nothing is mandatory.
 * <p>
 * Never force client to implement interface instead of building one fat interface
 * we should go for many small interfaces
 */
public class MouseMotionListenerExample implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
        //handler code
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //handler code
    }
}