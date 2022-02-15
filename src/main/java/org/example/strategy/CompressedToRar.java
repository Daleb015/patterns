package org.example.strategy;

public class CompressedToRar implements Strategy {

  @Override
  public void compressFile(String fileName) {
    System.out.println(fileName + "has been successfully converted to .rar file.");
  }
}
