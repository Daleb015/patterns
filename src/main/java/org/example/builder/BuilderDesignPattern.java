package org.example.builder;

public class BuilderDesignPattern {

  public static void main(String[] args) {
    Mobile m = Manufacturer.createCompleteObject();

    System.out.println(m);
  }
}
