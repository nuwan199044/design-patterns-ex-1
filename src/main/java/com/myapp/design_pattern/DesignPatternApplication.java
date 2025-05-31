package com.myapp.design_pattern;

import com.myapp.design_pattern.hardware.Company;
import com.myapp.design_pattern.hardware.GPU;
import com.myapp.design_pattern.hardware.Monitor;
import com.myapp.design_pattern.hardware.asus.AsusManufacturer;
import com.myapp.design_pattern.hardware.msi.MSIManufacturer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Company msi = new MSIManufacturer();
		GPU msiGPU = msi.createGPU();
		Monitor msiMonitor = msi.createMonitor();
		msiGPU.assemble();
		msiMonitor.assemble();

		Company asus = new AsusManufacturer();
		GPU asusGPU = asus.createGPU();
		Monitor asusMonitor = asus.createMonitor();
		asusGPU.assemble();
		asusMonitor.assemble();
	}
}
