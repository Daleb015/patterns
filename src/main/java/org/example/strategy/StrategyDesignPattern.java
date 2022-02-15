package org.example.strategy;

public class StrategyDesignPattern {

  public static void main(String[] args) {
    Context context = new Context();
    context.setCompressionStrategy(new CompressedToRar());
    context.generateFile("ABC.txt");
  }
}
