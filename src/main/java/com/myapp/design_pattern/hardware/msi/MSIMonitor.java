package com.myapp.design_pattern.hardware.msi;

import com.myapp.design_pattern.hardware.Monitor;

public class MSIMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("creating a msi monitor");
    }
}
