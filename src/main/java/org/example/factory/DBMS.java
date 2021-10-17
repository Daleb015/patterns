package org.example.factory;

public class DBMS implements Database {
    @Override
    public String connect() {
        return "connection Successfully with DBMS";
    }
}
