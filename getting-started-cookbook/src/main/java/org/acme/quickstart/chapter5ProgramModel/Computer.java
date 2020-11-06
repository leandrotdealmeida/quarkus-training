package org.acme.quickstart.chapter5ProgramModel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Computer {

    private String brand;
    private String serialNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
