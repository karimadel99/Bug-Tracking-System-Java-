/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tester_bugs;

import frames.developer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp
 */
public class changeStatues {
    public boolean news(String news,String bn,String dev){
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","karim","0000")) {
                Statement stmt = con.createStatement();
                  String sql = "update "+dev+" set bugStatues = '"+news+"' where bugName='"+bn+"'" ;
//               String sql2="update testerbugs set bugStatues = '"+news+"' where bugName='"+bn+"";
                  stmt.execute(sql);
                       } catch (SQLException ex) {
            Logger.getLogger(developer.class.getName()).log(Level.SEVERE, null, ex);
}
         return true;       
   }
}