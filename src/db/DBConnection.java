package db;

import java.sql.Connection;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection(){

    }

    public void init(Connection connection){
        if (this.connection == null){
            this.connection = connection;
        }else if (this.connection != connection){
            throw new RuntimeException("Connection has been already initialized");
        }
    }


}