package com.example.freemoneynoscam.repositories;

import com.example.freemoneynoscam.models.user;
import com.example.freemoneynoscam.repositories.dbconnect.DBManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class freeMoneyRepository {

    List<user> users = new ArrayList<>();

    public Connection getConn() {
        return conn;
    }

    Connection conn = DBManager.getConnection();


    public freeMoneyRepository() {
    }

    public List<user> getAllUser(){
        PreparedStatement ppst = null;
        try{
            ppst = conn.prepareStatement("SELECT * FROM victims");
            ResultSet rs = ppst.executeQuery();

            while(rs.next()){
                user rsUser = new user(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                users.add(rsUser);
            }

        }catch (SQLException e){
            System.out.println("Something is wrong");
            System.out.println(e.getMessage());
        }
        return users;
    }
}
