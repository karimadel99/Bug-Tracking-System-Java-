
package admin;
import frames.Project;
import connection.createCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Engineer {
    String id;
    String name;
    String email;
    String password;
    String dob;
    String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void register(String id,String name,String email,String password,
    String dob,String role){
        Connection con=createCon.getConnection();
        PreparedStatement ps;
        try{
            ps=con.prepareStatement("insert into user_info values(?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, dob);
            ps.setString(6,role );
            ps.execute();
            ps.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
