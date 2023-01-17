/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import connection.AdminDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author farrahtharwat
 */
public class AdminControllerImp implements AdminController {

    @Override
    public void add(Admin Role) {
    try{
            Connection con = AdminDB.getConnection();
            String sql = "INSERT INTO users VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,Role.getName());
            ps.setString(2, Role.getEmail());
            ps.setString(3, Role.getPassword());
            ps.setString(4,Role.getUsername());
            ps.setString(5,Role.getDOB());
            ps.setString(6,Role.getRole());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        }catch(Exception e){

            
        }
    }

    @Override
    public void update(Admin Role) {
      try{
           Connection con = AdminDB.getConnection();
           String sql = "Update users  set Role = ? where Name = ?";
           PreparedStatement ps = con.prepareStatement(sql);
           
           ps.setString( 1, Role.getRole());
           ps.setString(2, Role.getName());
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Updated!");
       } catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Error");
       }
    }
    @Override
    public void delete(Admin Role) {
      try{
           Connection con = AdminDB.getConnection();
           String sql = "delete from users where Name=?";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, Role.getName());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Deleted!");
       } catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Error");
       }
    }

    @Override
    public Admin get(String Name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Admin> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean loginAdmin(String Name, String Password) {
        try {
            Connection c = AdminDB.getConnection();
            PreparedStatement statement =null;
            ResultSet result =null;
            String query;
            query = "SELECT * FROM Admins where Username=? and Password=?";
            statement = c.prepareStatement(query);
            statement.setString(1,Name);
            statement.setString(2,Password);
            result = statement.executeQuery();
            if(result.next())
                return true;
            else
                return false;
            }catch (Exception ex) {
            Logger.getLogger(AdminControllerImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;  
    }
    
}
