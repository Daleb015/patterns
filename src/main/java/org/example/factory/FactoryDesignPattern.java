package org.example.factory;

public class FactoryDesignPattern {

  public static void main(String[] args) {
    Database db = null;

    db = DatabaseFactory.getDatabase("RDBMS");

    System.out.println("Database : " + db.getClass().getSimpleName());
    System.out.println(db.connect());
  }
}
