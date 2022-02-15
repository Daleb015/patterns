package org.example.factory;

public class RDBMS implements Database {

  @Override
  public String connect() {
    return "connection Successfully with RDBMS";
  }
}
