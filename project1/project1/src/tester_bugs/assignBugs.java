/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tester_bugs;

import connection.createCon;
import frames.Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp
 */
public class assignBugs {
    
 public void assignBug(String bugName,String bugStatues,String developerName){
             Connection con=createCon.getConnection();
        PreparedStatement ps; 
        try {
            ps=con.prepareStatement("insert into "+developerName+" values(?,?)");
            ps.setString(1, bugName);
            ps.setString(2, bugStatues);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
     
 }
}
