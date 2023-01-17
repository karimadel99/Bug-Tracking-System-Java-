/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

import connection.AdminDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author farrahtharwat
 */
//I DIDNT USE THAT BUT YOU CAN KEEP IT FOR ORGANIZATION
public class AdminBugControllerImp implements AdminBugController{
    
    @Override
    public void get(DefaultTableModel Model) {
        try{
        Connection con = AdminDB.getConnection();
        String sql = "Select * from Bugs";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           Model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3), rs.getInt(4), rs.getString(5)});
        }
        
    } catch (Exception e){
    } 
        
    }
    
}
