/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author farrahtharwat
 */
public class AdminDB {
    static Connection con;
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static String USERNAME = "karim";
    static String PASSWORD = "0000";

    /**
     *
     * @return
     * @throws Exception
     */
    
    public static Connection getConnection() throws Exception{
        if(con==null){
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url,USERNAME,PASSWORD);
        }
        return con;
    }
}
