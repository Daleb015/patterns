package org.example.factory;

public class DatabaseFactory {
    public static Database getDatabase(String dbType){
        Database dc = null;
        if ("RDBMS".equalsIgnoreCase(dbType))
            dc = new RDBMS();
        else
            dc = new DBMS();
        return dc;
    }
}
