package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.models.user;
import com.example.freemoneynoscam.repositories.freeMoneyRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class freeMoneyServices {
    private static freeMoneyRepository fmr;

    public freeMoneyServices(){
        fmr = new freeMoneyRepository();
    }

    public List<user> getAllUsers(){
        return fmr.getAllUser();
    }

    public void addMail(String name,String mail){
        try {
            PreparedStatement ppst = fmr.getConn().prepareStatement
                    ("INSERT INTO victims (victimsnames,victimsmails) VALUES (?,?)");
            ppst.setString(1,name);
            ppst.setString(2,mail);
            ppst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something is wrong");
            System.out.println(e.getMessage());
        }
    }
}
