package org.example.builder;

public class MobileConcreteBuilder extends MobileBuilder{
    @Override
    public void createMemory() {
        getMobile().setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("4500 mAh");
        System.out.println("Battery created and installed");
    }

    @Override
    public void createWireless() {
        getMobile().setWireless("BlueTooth and Wifi");
        System.out.println("Created Wireless features and installed");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Amoled");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        getMobile().setMetalCase("Aluminum");
        System.out.println("MetalCase created and installed");
    }
}
