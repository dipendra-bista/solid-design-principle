package com.punojsoft.soliddesign.dependencyinversion;

/**
 * This code will work, and we'll be able to use the StandardKeyboard and Monitor freely within our Windows98Computer class.
 * Problem solved? Not quite.
 * By declaring the StandardKeyboard and Monitor with the new keyword, we've tightly coupled these 3 classes together.
 * <p>
 * Not only does this make our Windows98Computer hard to test, but we've also lost the ability to switch out our
 * StandardKeyboard class with a different one should the need arise. And we're stuck with our Monitor class, too
 */
public class Windows98Machine {

    private final StandardKeyboard keyboard;

    public Windows98Machine() {
        keyboard = new StandardKeyboard();
    }

}