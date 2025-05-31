package com.myapp.design_pattern.hardware.msi;

import com.myapp.design_pattern.hardware.GPU;

public class MSIGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("creating a msi GPU");
    }
}
