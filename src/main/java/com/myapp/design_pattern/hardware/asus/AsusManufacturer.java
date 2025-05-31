package com.myapp.design_pattern.hardware.asus;

import com.myapp.design_pattern.hardware.Company;
import com.myapp.design_pattern.hardware.GPU;
import com.myapp.design_pattern.hardware.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public GPU createGPU() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
