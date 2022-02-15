package org.example.builder;

public class Manufacturer {

  public static Mobile createCompleteObject() {
    MobileBuilder mobileBuilder = new MobileConcreteBuilder();

    return mobileBuilder.buildMobile();
  }
}
