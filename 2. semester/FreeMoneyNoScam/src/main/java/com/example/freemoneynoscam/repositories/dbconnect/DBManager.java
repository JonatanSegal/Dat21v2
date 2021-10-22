package com.example.freemoneynoscam.repositories.dbconnect;
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DBManager {
    private static String user;
    private static String password;
    private static String url;
    private static Connection connection = null;


    public static Connection getConnection(){      if (connection != null) {
        return connection;
    }
        try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url,user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
/*
    public DBManager(){}

    public void connect(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/free_money_no_scam","Fumio","K53x5nj#");
            PreparedStatement psts = conn.prepareStatement("SELECT * from victims");
            ResultSet resultSet = psts.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
            }

        }catch(SQLException e){
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }

    }
    public void updateMail(String mail){

    }

     */

}
