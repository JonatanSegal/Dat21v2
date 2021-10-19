package com.example.freemoneynoscam.repositories;
import java.sql.*;

public class scamDB {
    public scamDB(){}

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

}
