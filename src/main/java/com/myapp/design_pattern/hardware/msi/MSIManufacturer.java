package com.myapp.design_pattern.hardware.msi;

import com.myapp.design_pattern.hardware.Company;
import com.myapp.design_pattern.hardware.GPU;
import com.myapp.design_pattern.hardware.Monitor;

public class MSIManufacturer extends Company {

    @Override
    public GPU createGPU() {
        return new MSIGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MSIMonitor();
    }
}
