package com.myapp.design_pattern.hardware.asus;

import com.myapp.design_pattern.hardware.Monitor;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("creating a asus monitor");
    }
}
