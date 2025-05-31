package com.myapp.design_pattern.hardware.asus;

import com.myapp.design_pattern.hardware.GPU;

public class AsusGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("creating a asus GPU");
    }
}
