
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class createCon {
    public static Connection getConnection()
    {
       Connection con = null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false","karim","0000");
          } catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
          }
           return con;
    }
}
