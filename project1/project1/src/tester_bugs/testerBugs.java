
package tester_bugs;
import frames.Project;
import connection.createCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class testerBugs extends bugs{
 public void add(String bugName, String bugType, String bugPriority,String bugLevel,String bugDate, String bugSatues, String projectName){
        Connection con=createCon.getConnection();
        PreparedStatement ps; 
        try {
            ps=con.prepareStatement("insert into testerbugs values(?,?,?,?,?,?,?)");
            ps.setString(1, bugName);
            ps.setString(2, bugType);
            ps.setString(3, bugPriority);
            ps.setString(4, bugLevel);
            ps.setString(5, projectName);
            ps.setString(6, bugDate);
            ps.setString(7,bugSatues );
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
         
 }
 
}
